package br.com.fllsouto.interviews.caju.cca.service.adapters;

import java.util.List;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.TransactionForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AuthorizationOutput;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.service.ports.IAuthorizationService;
import br.com.fllsouto.interviews.caju.cca.usecase.authorization.BasicAuthorizationUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.authorization.FallbackAuthorizationUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.authorization.IAuthorizationUC;
import br.com.fllsouto.interviews.caju.cca.usecase.authorization.ValidateAuthorizationUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AuthorizationUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AuthorizationUCOutput;

public class AuthorizationServiceImpl implements IAuthorizationService {

    private AuthorizationChain authorizationChain;

    public AuthorizationServiceImpl(AccountRepository accountRepository) {
        this.authorizationChain = getAuthorizationChain(accountRepository);
    }
    
    @Override
    public AuthorizationOutput authorize(TransactionForm form) {
        AuthorizationUCOutput ucOutput = new AuthorizationUCOutput();
        AuthorizationUCInput ucInput = AuthorizationUCInput.buildFrom(form);

        while (this.authorizationChain.hasNext()) {
            this.authorizationChain.getNext().run(ucInput, ucOutput);
            if (ucOutput.isAuthorized())
                break;
        }

        return ucOutput.toOutput();
    }

    private AuthorizationChain getAuthorizationChain(AccountRepository accountRepository) {
        var usecase0 = new ValidateAuthorizationUCImpl(accountRepository);
        var usecase1 = new BasicAuthorizationUCImpl(accountRepository);
        var usecase2 = new FallbackAuthorizationUCImpl(accountRepository);

        return new AuthorizationChain(List.of(usecase0, usecase1, usecase2));
    }
    
    private class AuthorizationChain {
    
        private List<IAuthorizationUC> usecases;
        private int index;
    
        public AuthorizationChain(List<IAuthorizationUC> usecases) {
            this.usecases = usecases;
            this.index = 0;
        }
    
        public boolean hasNext() {
            return (this.usecases.size() <= this.index);
        }
    
        public IAuthorizationUC getNext() {
            return this.usecases.get(this.index++);
        }
    }
}

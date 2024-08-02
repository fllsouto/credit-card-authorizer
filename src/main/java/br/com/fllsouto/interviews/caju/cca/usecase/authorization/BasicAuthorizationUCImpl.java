package br.com.fllsouto.interviews.caju.cca.usecase.authorization;

import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.domain.type.AuthorizationCodeType;
import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.AuthorizationUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.AuthorizationUCOutput;

public class BasicAuthorizationUCImpl implements IAuthorizationUC{

    private AccountRepository accountRepository;

    public BasicAuthorizationUCImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // // TODO: Refactor this after testing!
    @Override
    public void run(AuthorizationUCInput input, AuthorizationUCOutput output) {
        Account acc = output.getAcc();
        MerchantType merchType = MerchantType.getTypeFrom(input.getMcc());
        boolean result = acc.withdraw(merchType, input.getTotalAmount());

        System.out.println("MerchType: " + merchType);
        System.out.println("Result: " + result);

        if (!result) {
            output.setNewCode(AuthorizationCodeType.DENIED_LACK_OF_BALANCE);
        } else {
            accountRepository.save(acc);
            output.setNewCode(AuthorizationCodeType.APPROVED);
        }
    }

}

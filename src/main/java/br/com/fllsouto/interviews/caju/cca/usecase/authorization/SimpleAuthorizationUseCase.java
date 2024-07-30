package br.com.fllsouto.interviews.caju.cca.usecase.authorization;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.input.TransactionInput;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AuthorizationOutput;
import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;
import br.com.fllsouto.interviews.caju.cca.domain.type.AuthorizationCodeType;
import br.com.fllsouto.interviews.caju.cca.domain.type.MerchantType;

@Service
public class SimpleAuthorizationUseCase {

    private AccountRepository accountRepository;

    public SimpleAuthorizationUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // TODO: Refactor this after testing!
    public AuthorizationOutput run(TransactionInput input) {
        Optional<Account> optAcc = accountRepository.findByUuid(input.getAccountId());
        if (optAcc.isEmpty())
            return buildOutput(AuthorizationCodeType.DENIED_INTERNAL_ERROR);

        MerchantType merchType = MerchantType.getTypeFrom(input.getMcc());
        Account acc = optAcc.get();
        boolean result = acc.withdraw(merchType, input.getTotalAmount());

        System.out.println("MerchType: " + merchType);
        System.out.println("Result: " + result);

        if (!result)
            return buildOutput(AuthorizationCodeType.DENIED_LACK_OF_BALANCE);

        accountRepository.save(acc);
        return buildOutput(AuthorizationCodeType.APPROVED);
    }

    private AuthorizationOutput buildOutput(AuthorizationCodeType codeType) {
        return new AuthorizationOutput(codeType.getCode());
    }
}

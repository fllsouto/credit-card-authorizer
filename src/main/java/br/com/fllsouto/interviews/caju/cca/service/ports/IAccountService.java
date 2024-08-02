package br.com.fllsouto.interviews.caju.cca.service.ports;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateAccountForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AccountOutput;
import java.util.List;
import java.util.UUID;

public interface IAccountService {
    
    public AccountOutput create(CreateAccountForm form);
    public AccountOutput get(UUID accountUUID);
    public List<AccountOutput> list();
}

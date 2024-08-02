package br.com.fllsouto.interviews.caju.cca.service.ports;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.TransactionForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.AuthorizationOutput;

@Service
public interface IAuthorizationService {
    public AuthorizationOutput authorize(TransactionForm form);
}

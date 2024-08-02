package br.com.fllsouto.interviews.caju.cca.infra.adapters;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.Repository;

import br.com.fllsouto.interviews.caju.cca.domain.model.Account;
import br.com.fllsouto.interviews.caju.cca.domain.repository.AccountRepository;

public interface AccountRepositoryInMemoryAdapter 
    extends AccountRepository, Repository<Account, Long> {

    Account save(Account account);
    List<Account> findAll();
    Optional<Account> findByUUID(UUID uuid);
}

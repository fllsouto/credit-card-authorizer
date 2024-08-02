package br.com.fllsouto.interviews.caju.cca.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.fllsouto.interviews.caju.cca.domain.model.Account;

@Repository
public interface AccountRepository {

    Account save(Account account);
    List<Account> findAll();
    Optional<Account> findByUUID(UUID uuid);

}

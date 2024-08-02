package br.com.fllsouto.interviews.caju.cca.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.fllsouto.interviews.caju.cca.domain.model.Merchant;

@Repository
public interface MerchantRepository {

    Merchant save(Merchant merchant);
    List<Merchant> findAll();
    Optional<Merchant> findByUUID(UUID uuid);

}

package br.com.fllsouto.interviews.caju.cca.infra.adapters;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.Repository;

import br.com.fllsouto.interviews.caju.cca.domain.model.Merchant;
import br.com.fllsouto.interviews.caju.cca.domain.repository.MerchantRepository;

public interface MerchantRepositoryInMemoryAdapter 
    extends MerchantRepository, Repository<Merchant, Long> {

    Merchant save(Merchant Merchant);
    List<Merchant> findAll();
    Optional<Merchant> findByUUID(UUID uuid);
}

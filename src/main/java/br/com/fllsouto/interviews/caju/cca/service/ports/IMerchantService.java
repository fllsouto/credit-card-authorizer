package br.com.fllsouto.interviews.caju.cca.service.ports;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateMerchantForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.MerchantOutput;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

public interface IMerchantService {
    public MerchantOutput create(CreateMerchantForm input);
    public Optional<MerchantOutput> get(UUID accountUUID);
    public List<MerchantOutput> list();
    
}

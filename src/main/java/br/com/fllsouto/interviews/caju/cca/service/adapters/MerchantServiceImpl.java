package br.com.fllsouto.interviews.caju.cca.service.adapters;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateMerchantForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.MerchantOutput;
import br.com.fllsouto.interviews.caju.cca.domain.repository.MerchantRepository;
import br.com.fllsouto.interviews.caju.cca.service.ports.IMerchantService;
import br.com.fllsouto.interviews.caju.cca.usecase.merchant.CreateMerchantUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.merchant.GetMerchantUCImpl;
import br.com.fllsouto.interviews.caju.cca.usecase.merchant.IMerchantUC;
import br.com.fllsouto.interviews.caju.cca.usecase.merchant.ListMerchantUCImpl;

@Service
public class MerchantServiceImpl implements IMerchantService {

    private IMerchantUC createMerchantUC;
    private IMerchantUC getMerchantUC;
    private IMerchantUC listMerchantUC;

    public MerchantServiceImpl(MerchantRepository repository) {
        this.createMerchantUC = new CreateMerchantUCImpl(repository);
        this.getMerchantUC = new GetMerchantUCImpl(repository);
        this.listMerchantUC = new ListMerchantUCImpl(repository);
    }

    //TODO: FIX THIS
    @Override
    public MerchantOutput create(CreateMerchantForm form) {
        this.createMerchantUC.run(null, null);
    }
    
    //TODO: FIX THIS
    @Override
    public Optional<MerchantOutput> get(UUID uuid) {
        this.getMerchantUC.run(null, null);
    }
    
    //TODO: FIX THIS
    @Override
    public List<MerchantOutput> list() {
        this.listMerchantUC.run(null, null);
    }
    
}

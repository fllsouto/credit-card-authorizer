package br.com.fllsouto.interviews.caju.cca.service.adapters;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateMerchantForm;
import br.com.fllsouto.interviews.caju.cca.api.payload.output.MerchantOutput;
import br.com.fllsouto.interviews.caju.cca.domain.repository.MerchantRepository;
import br.com.fllsouto.interviews.caju.cca.service.ports.IMerchantService;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.MerchantUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.MerchantUCOutput;
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

    @Override
    public MerchantOutput create(CreateMerchantForm form) {
        MerchantUCInput input = new MerchantUCInput(form);
        MerchantUCOutput output = new MerchantUCOutput(); 

        this.createMerchantUC.run(input, output);
        return output.mapToOutput();
    }
    
    @Override
    public MerchantOutput get(UUID merchantUUID) {
        MerchantUCInput input = new MerchantUCInput(merchantUUID);
        MerchantUCOutput output = new MerchantUCOutput();

        this.getMerchantUC.run(input, output);
        return output.mapToOutput();
    }
    
    @Override
    public List<MerchantOutput> list() {
        MerchantUCInput input = new MerchantUCInput();
        MerchantUCOutput output = new MerchantUCOutput();

        this.listMerchantUC.run(input, output);
        return output.mapToOutputList();    
    }
    
}

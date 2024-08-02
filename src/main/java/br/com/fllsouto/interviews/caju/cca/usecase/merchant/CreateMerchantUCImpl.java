package br.com.fllsouto.interviews.caju.cca.usecase.merchant;

import br.com.fllsouto.interviews.caju.cca.domain.model.Merchant;
import br.com.fllsouto.interviews.caju.cca.domain.repository.MerchantRepository;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.MerchantUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.MerchantUCOutput;

public class CreateMerchantUCImpl implements IMerchantUC {

    private MerchantRepository merchantRepository;

    public CreateMerchantUCImpl(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }
    
    @Override
    public void run(MerchantUCInput input, MerchantUCOutput output) {
        Merchant merchant = toDomainModel(input);
        Merchant newMerchant = this.merchantRepository.save(merchant);
        System.out.println(newMerchant);
        output.update(newMerchant);
    }

    private Merchant toDomainModel(MerchantUCInput input) {
        return new Merchant(
            input.getName(), 
            input.getPreferedType()
        );
    }
}

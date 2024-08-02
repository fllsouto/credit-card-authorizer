package br.com.fllsouto.interviews.caju.cca.usecase.merchant;

import java.util.Optional;
import br.com.fllsouto.interviews.caju.cca.domain.model.Merchant;
import br.com.fllsouto.interviews.caju.cca.domain.repository.MerchantRepository;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.MerchantUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.MerchantUCOutput;

public class GetMerchantUCImpl implements IMerchantUC {

    private MerchantRepository merchantRepository;

    public GetMerchantUCImpl(MerchantRepository MerchantRepository) {
        this.merchantRepository = MerchantRepository;
    }

    @Override
    public void run(MerchantUCInput input, MerchantUCOutput output) {
        Optional<Merchant> optMerch = merchantRepository.findByUUID(input.getUUID());
        output.setMerch(optMerch);
    }
}

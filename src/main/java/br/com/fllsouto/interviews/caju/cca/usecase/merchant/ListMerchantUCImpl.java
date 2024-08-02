package br.com.fllsouto.interviews.caju.cca.usecase.merchant;

import java.util.List;
import br.com.fllsouto.interviews.caju.cca.domain.model.Merchant;
import br.com.fllsouto.interviews.caju.cca.domain.repository.MerchantRepository;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.MerchantUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.MerchantUCOutput;

public class ListMerchantUCImpl implements IMerchantUC {

    private MerchantRepository MerchantRepository;

    public ListMerchantUCImpl(MerchantRepository MerchantRepository) {
        this.MerchantRepository = MerchantRepository;
    }

    @Override
    public void run(MerchantUCInput input, MerchantUCOutput output) {
        List<Merchant> merchs =  MerchantRepository.findAll();
        output.setMerch(merchs);
    }
}

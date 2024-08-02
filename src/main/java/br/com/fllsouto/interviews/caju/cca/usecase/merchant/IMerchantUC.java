package br.com.fllsouto.interviews.caju.cca.usecase.merchant;

import br.com.fllsouto.interviews.caju.cca.usecase.dto.input.MerchantUCInput;
import br.com.fllsouto.interviews.caju.cca.usecase.dto.output.MerchantUCOutput;

public interface IMerchantUC {
    public void run(MerchantUCInput input, MerchantUCOutput output);
}
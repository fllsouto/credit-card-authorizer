package br.com.fllsouto.interviews.caju.cca.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.fllsouto.interviews.caju.cca.api.payload.output.MerchantOutput;
import br.com.fllsouto.interviews.caju.cca.api.payload.form.CreateMerchantForm;
import br.com.fllsouto.interviews.caju.cca.service.ports.IMerchantService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

    private IMerchantService merchantService;

    public MerchantController(IMerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @GetMapping
    public List<MerchantOutput> list() {
        return this.merchantService.list();
    }

    @GetMapping("/{merchantUUID}")
    public MerchantOutput getMerchantById(@PathVariable UUID uuid) {
        return this.merchantService.get(uuid);
    }

    @PostMapping //TODO: Validate input data
    public MerchantOutput createMerchant(@RequestBody CreateMerchantForm input) {
        return this.merchantService.create(input);
    }
}

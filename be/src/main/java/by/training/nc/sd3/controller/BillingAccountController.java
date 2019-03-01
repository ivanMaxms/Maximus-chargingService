package by.training.nc.sd3.controller;

import by.training.nc.sd3.entity.BillingAccount;
import by.training.nc.sd3.service.BillingAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/billing-accounts")
public class BillingAccountController {

    private BillingAccountService billingAccountService;

    public BillingAccountController(BillingAccountService billingAccountService) {
        this.billingAccountService = billingAccountService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<BillingAccount> getAll() {
        return this.billingAccountService.getAll();
    }

    @RequestMapping(value = "/by-owner-id", method = RequestMethod.GET)
    public Iterable<BillingAccount> getAllByOwnerId(@RequestParam Long ownerId) {
        return this.billingAccountService.getAllByOwnerId(ownerId);
    }

    @RequestMapping(value = "/by-id", method = RequestMethod.GET)
    public Optional<BillingAccount> getById(@RequestParam Long id) {
        return this.billingAccountService.getById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BillingAccount save(@RequestBody BillingAccount billingAccount) {
        return this.billingAccountService.save(billingAccount);
    }
}

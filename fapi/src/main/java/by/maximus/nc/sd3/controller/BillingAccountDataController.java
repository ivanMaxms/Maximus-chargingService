package by.maximus.nc.sd3.controller;

import by.maximus.nc.sd3.models.BillingAccountViewModel;
import by.maximus.nc.sd3.service.BillingAccountDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping("/api/ba")
public class BillingAccountDataController {

    @Autowired
    private BillingAccountDataService billingAccountDataService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<BillingAccountViewModel> saveBillingAccount(@RequestBody BillingAccountViewModel billingAccount) {
        if (billingAccount != null) {
            return ResponseEntity.ok(billingAccountDataService.saveBillingAccount(billingAccount));
        }
        return null;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<BillingAccountViewModel>> getAllBillingAccounts() {
        return ResponseEntity.ok(billingAccountDataService.getAll());
    }

    @RequestMapping(value = "/get-by-id", method = RequestMethod.GET)
    public ResponseEntity<BillingAccountViewModel> getBillingAccountById(@RequestParam Long id) {
        return ResponseEntity.ok(billingAccountDataService.getBillingAccountById(id));
    }

    @RequestMapping(value = "/get-by-ownerid", method = RequestMethod.GET)
    public ResponseEntity<List<BillingAccountViewModel>> getBillingAccountByOwnerId(@RequestParam Long id) {
        return ResponseEntity.ok(billingAccountDataService.getBillingAccountsByOwnerId(id));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBillingAccount(@PathVariable Long id, @RequestParam String password) {
        billingAccountDataService.deleteBillingAccountById(id, password);
    }

}

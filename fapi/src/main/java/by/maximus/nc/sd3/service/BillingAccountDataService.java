package by.maximus.nc.sd3.service;

import by.maximus.nc.sd3.models.BillingAccountViewModel;

import java.util.List;

public interface BillingAccountDataService {
    BillingAccountViewModel saveBillingAccount(BillingAccountViewModel account);
    List<BillingAccountViewModel> getAll();
    BillingAccountViewModel getBillingAccountById(Long id);
    void deleteBillingAccountById(Long id, String password);
    List<BillingAccountViewModel> getBillingAccountsByOwnerId(Long id);
}

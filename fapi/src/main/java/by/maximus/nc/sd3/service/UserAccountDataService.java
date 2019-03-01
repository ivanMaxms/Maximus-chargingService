package by.maximus.nc.sd3.service;

import by.maximus.nc.sd3.models.UserAccountViewModel;

public interface UserAccountDataService {
    UserAccountViewModel getUserAccountById(Long id);
    UserAccountViewModel getUserAccountByData(String login, String password);
    UserAccountViewModel saveUserAccount(UserAccountViewModel account, Long activeBillingAccountId);
    UserAccountViewModel[] getAll();
    UserAccountViewModel changeActiveBillingAccount(UserAccountViewModel userAccountViewModel,
                                                    Long billingAccountId);
    Integer subscriptionsQuantity(Long id);
}

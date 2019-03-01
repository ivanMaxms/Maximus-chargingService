package by.training.nc.sd3.service;
import by.training.nc.sd3.entity.UserAccount;

import java.util.Optional;

public interface UserAccountService {

    Optional<UserAccount> getUserAccount(String name, String password);
    Optional<UserAccount> getUserAccountById(Long id);
    UserAccount save(UserAccount userAccount);
    Iterable<UserAccount> getAll();
}

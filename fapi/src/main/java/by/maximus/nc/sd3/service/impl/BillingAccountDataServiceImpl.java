package by.training.nc.sd3.service.impl;

import by.training.nc.sd3.models.BillingAccountViewModel;
import by.training.nc.sd3.service.BillingAccountDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class BillingAccountDataServiceImpl implements BillingAccountDataService {

    @Value("http://localhost:8081/")
    private String backendServerUrl;

    public BillingAccountViewModel getBillingAccountById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        BillingAccountViewModel billingAccount = restTemplate.getForObject(backendServerUrl + "/api/billing-accounts/by-id?id={id}",
                BillingAccountViewModel.class, id);
        return billingAccount;
    }

}

package by.maximus.nc.sd3.service.impl;

import by.maximus.nc.sd3.models.SubscriptionUnitViewModel;
import by.maximus.nc.sd3.service.SubscriptionUnitDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SubscriptionUnitDataServiceImpl implements SubscriptionUnitDataService {

    @Value("http://localhost:8081/")
    private String backendServerUrl;

}

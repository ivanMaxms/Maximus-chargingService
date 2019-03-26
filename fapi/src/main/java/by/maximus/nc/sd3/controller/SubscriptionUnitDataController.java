package by.maximus.nc.sd3.controller;

import by.maximus.nc.sd3.models.SubscriptionUnitViewModel;
import by.maximus.nc.sd3.service.SubscriptionUnitDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subsunits")
public class SubscriptionUnitDataController {

    @Autowired
    private SubscriptionUnitDataService subscriptionUnitDataService;


}

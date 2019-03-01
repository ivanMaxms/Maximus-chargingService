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

    @RequestMapping(value = "/get-by-userid", method = RequestMethod.GET)
    public ResponseEntity<List<SubscriptionUnitViewModel>> getSubscriptionUnitsByUserId(@RequestParam("userId") Long id) {
        return ResponseEntity.ok(subscriptionUnitDataService.getSubscriptionUnitsByUserId(id));
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        subscriptionUnitDataService.delete(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<SubscriptionUnitViewModel> save(@RequestBody SubscriptionUnitViewModel subscriptionUnitViewModel) {
        return ResponseEntity.ok(subscriptionUnitDataService.save(subscriptionUnitViewModel));
    }

    @PostMapping(value = "/change-status")
    public ResponseEntity<SubscriptionUnitViewModel> changeStatus(@RequestBody SubscriptionUnitViewModel subscriptionUnitViewModel) {
        return ResponseEntity.ok(subscriptionUnitDataService.changeStatus(subscriptionUnitViewModel));
    }

}

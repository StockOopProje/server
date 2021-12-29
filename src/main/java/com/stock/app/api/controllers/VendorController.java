package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.VendorService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Vendor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/vendor")
@RequiredArgsConstructor
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping(path="/addVendor")
    public Result addVendor(@RequestBody Vendor vendor){
        return vendorService.addVendor(vendor);
    }

    @PostMapping(path="/listPurchases")
    public Result listPurchases(@RequestBody Vendor vendor){
        return vendorService.listPurchases(vendor.getId());
    }

    @PostMapping(path="/displayVendor")
    public Result displayVendor(@RequestBody Vendor vendor){
        return vendorService.displayVendor(vendor.getId());
    }

    @PostMapping(path="/deleteVendor")
    public Result deleteVendor(@RequestBody Vendor vendor){
        return vendorService.deleteVendor(vendor.getId());
    }

    @PostMapping(path="/updateVendor")
    public Result updateVendor(@RequestBody Vendor vendor){
        return vendorService.updateVendor(vendor);
    }
}

package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.CustomerService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path="/getAll")
    public Result getAll(){return customerService.getAll();}

    @PostMapping(path="/addCustomer")
    public Result addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PostMapping(path="/listSales")
    public Result listSales(@RequestBody Customer customer){
        return customerService.listSales(customer.getId());
    }

    @PostMapping(path="/displayCustomer")
    public Result displayCustomer(@RequestBody Customer customer){
        return customerService.displayCustomer(customer.getId());
    }

    @PostMapping(path="/deleteCustomer")
    public Result deleteCustomer(@RequestBody Customer customer){
        return customerService.deleteCustomer(customer.getId());
    }

    @PostMapping(path="/updateCustomer")
    public Result updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

}

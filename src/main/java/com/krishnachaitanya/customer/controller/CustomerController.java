package com.krishnachaitanya.customer.controller;

import com.krishnachaitanya.customer.reward.CustomerReward;
import com.krishnachaitanya.customer.service.CustomerService;
import com.krishnachaitanya.customer.transaction.CustomerTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.krishnachaitanya.customer.UserPrincipalNotFoundException;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<CustomerTransaction> getAllTransactions() {
        return customerService.getAllTransactions();
    }

    @GetMapping("/last3months")
    public List<CustomerTransaction> getTransactionsWithinThreeMonths() {
        return customerService.getTransactionsWithinThreeMonths();
    }

    @GetMapping("customer/{id}")
    public CustomerReward getCustomerReward(@PathVariable String id) {
        CustomerReward customerReward = customerService.getCustomerReward(id);
        if(customerReward == null) {
            throw new UserPrincipalNotFoundException("user id: "+id+ " has no transaction within last 3 months.");
        }
        return customerReward;
    }
}

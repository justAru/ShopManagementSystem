package kz.iitu.midtermProject.controller;

import kz.iitu.midtermProject.model.Customer;
import kz.iitu.midtermProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public Customer getCustomerById(Long id){
        return customerService.getById(id);
    }
}

package kz.iitu.midtermProject.controller;

import kz.iitu.midtermProject.model.Customer;
import kz.iitu.midtermProject.model.Item;
import kz.iitu.midtermProject.service.CustomerService;
import kz.iitu.midtermProject.service.ItemService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    public Item getCustomerById(Long id){
        return itemService.getById(id);
    }
}

package kz.iitu.midtermProject.controller;

import io.swagger.annotations.Api;
import kz.iitu.midtermProject.model.Order;
import kz.iitu.midtermProject.service.iOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@Api(value = "UserBooks Controller class", description = "This class allows to interact with Orders object")
public class OrderController {

    @Autowired
    private iOrderService iOrderService;

    @PostMapping("/create")
    public Order create(@RequestBody Order o){
        return iOrderService.create(o);
    }

    @PutMapping("/update")
    public Order update(@RequestBody Order o){
        return iOrderService.update(o);
    }

    @GetMapping("/{id}")
    public Order get(@PathVariable Long id){
        return iOrderService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
         iOrderService.deleteById(id);
    }

    @GetMapping("/all")
    public List<Order> getAll(){
        return iOrderService.getAll();
    }

    @GetMapping("/allByUserId")
    public List<Order> getAllByUserId(@Param(value = "id") Long id){
        return iOrderService.getAllByUser(id);
    }

    @GetMapping("/allByItemId")
    public List<Order> getAllByItemId(@Param(value = "id") Long id){
        return iOrderService.getAllByItem(id);
    }
}

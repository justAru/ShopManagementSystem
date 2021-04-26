package kz.iitu.midtermProject.service.impl;

import kz.iitu.midtermProject.model.Order;
import kz.iitu.midtermProject.repository.OrderRepository;
import kz.iitu.midtermProject.service.iOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class OrderService implements iOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order create(Order o) {
        return orderRepository.save(o);
    }

    @Override
    public Order update(Order o) {
        return orderRepository.save(o);
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order getById(Long id) {
        return orderRepository.getById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getAllByUser(Long id) {
        return orderRepository.getAllByUser(id);
    }

    @Override
    public List<Order> getAllByItem(Long id) {
        return orderRepository.getAllByItem(id);
    }
}

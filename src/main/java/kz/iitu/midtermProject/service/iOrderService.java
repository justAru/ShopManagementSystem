package kz.iitu.midtermProject.service;

import kz.iitu.midtermProject.model.Order;

import java.util.List;

public interface iOrderService {
    Order create(Order o);
    Order update(Order o);
    void deleteById(Long id);
    Order getById(Long id);
    List<Order> getAll();
    List<Order> getAllByUser(Long id);
    List<Order> getAllByItem(Long id);
}

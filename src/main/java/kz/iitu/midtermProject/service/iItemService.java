package kz.iitu.midtermProject.service;

import kz.iitu.midtermProject.model.Item;

import java.util.List;

public interface iItemService {
    Item create(Item o);
    Item update(Item o);
    void delete(Long o);
    Item getById(Long id);
    List<Item> getAll();
    List<Item> getAllByName(String name);
    List<Item> getAllByDesc(String description);
    List<Item> getAllByCustomer(Long customer_id);
}

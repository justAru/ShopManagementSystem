package kz.iitu.midtermProject.service.impl;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import kz.iitu.midtermProject.model.Item;

import kz.iitu.midtermProject.repository.ItemRepository;
import kz.iitu.midtermProject.service.iItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements iItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item create(Item o) {
        return itemRepository.save(o);
    }

    @Override
    public Item update(Item o) {
        return itemRepository.save(o);
    }

    @Override
    public void delete(Long o) {
        itemRepository.delete(getById(o));
    }

    @Override
    public Item getById(Long id) {
        return itemRepository.getById(id);
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> getAllByName(String name) {
        return itemRepository.getByNameContaining(name);
    }

    @Override
    public List<Item> getAllByDesc(String info) {
        return itemRepository.getAllByInfoContaining(info);
    }

    @Override
    public List<Item> getAllByCustomer(Long authorId) {
        return itemRepository.getAllByCustomerId(authorId);
    }
}


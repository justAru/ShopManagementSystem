package kz.iitu.midtermProject.repository;

import kz.iitu.midtermProject.model.Item;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item getById(Long id);
    List<Item> getByNameContaining(String name);
    List<Item> getAllByInfoContaining(String info);
    List<Item> getAllByCustomerId(Long customerId);
}

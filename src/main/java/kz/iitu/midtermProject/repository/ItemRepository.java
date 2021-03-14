package kz.iitu.midtermProject.repository;

import kz.iitu.midtermProject.model.Item;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    public Item findByName(String name);
    public Item findItemById(Long id);

}

package kz.iitu.midtermProject.repository;

import kz.iitu.midtermProject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order getById(Long id);
    List<Order> getAllByUser(Long id);
    List<Order> getAllByItem(Long id);
}

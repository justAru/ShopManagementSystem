package kz.iitu.midtermProject.repository;

import kz.iitu.midtermProject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findCustomerById(Long id);
}

package kz.iitu.midtermProject.repository;

import kz.iitu.midtermProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserById(Long id);
    User getById(Long id);
    List<User> getAllByFullNameContaining(String fullName);
    List<User> deleteUserById(Long id);
    User findByUsername(String username);
}

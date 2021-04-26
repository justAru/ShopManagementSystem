package kz.iitu.midtermProject.service;
import kz.iitu.midtermProject.model.User;



import kz.iitu.midtermProject.model.User;

import java.util.List;

public interface iUserService {
    User update(User o);
    void deleteUserById(Long id);
    User getById(Long id);
    List<User> getAll();
    List<User> getAllByName(String name);
    User createUser(User user);
    void updateUser(Long id, User user);
}

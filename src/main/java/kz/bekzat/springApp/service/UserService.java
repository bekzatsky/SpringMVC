package kz.bekzat.springApp.service;

import kz.bekzat.springApp.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> usersList();
}

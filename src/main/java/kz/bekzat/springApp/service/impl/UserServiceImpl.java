package kz.bekzat.springApp.service.impl;

import kz.bekzat.springApp.dao.UserDao;
import kz.bekzat.springApp.model.User;
import kz.bekzat.springApp.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    public void removeUser(Long id) {
        userDao.removeUser(id);
    }

    @Transactional
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Transactional
    public List<User> usersList() {
        return userDao.usersList();
    }
}

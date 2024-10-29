package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    public void save(User user);

    public void delete(Long id);

    public void update(User user);

    public User findById(Long Id);

    public List<User> getAllUsers();
    User findByUsernameWithRoles(String username);

}
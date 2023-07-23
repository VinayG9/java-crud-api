package com.smartContact.service;

import com.smartContact.model.User;
import com.smartContact.repository.UserDao;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> fetchUserList();


   public User fetchUserById(int id);

    public void deleteUser(int id);

   public void updateUser(int id, User user);
}
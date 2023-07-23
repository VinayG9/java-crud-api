package com.smartContact.service;
import com.smartContact.model.User;
import com.smartContact.repository.UserDao;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }


    @Override
    public List<User> fetchUserList() {
        return userDao.findAll();
    }

    @Override
    public User fetchUserById(int id) {
        return userDao.findById(id).get();
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    @Override
    public void updateUser(int id, User user){
        user.setId(id);
        userDao.save(user);






    }

}





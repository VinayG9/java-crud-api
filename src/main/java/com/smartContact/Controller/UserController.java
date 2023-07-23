package com.smartContact.Controller;
import com.smartContact.model.User;
import com.smartContact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private  UserService userService;

    @PostMapping("/save_user_data")
    public ResponseEntity<String> saveUser(@RequestBody User user){
          userService.saveUser(user);
        return new ResponseEntity<>("User data saved successfully!", HttpStatus.OK);
    }

    @GetMapping("/get_user_data")
    public List<User> fetchUserList(){
        return userService.fetchUserList();
   }

    @GetMapping("/get_user_data/{id}")
    public User fetchUserById(@PathVariable("id") int id){
        return userService.fetchUserById(id);
    }

    @DeleteMapping("/delete_user_data/{id}")
    public ResponseEntity<String>deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return new ResponseEntity<>("user data deleted Successfully",HttpStatus.OK);
    }

    @PutMapping("/update_user_data/{id}")
    public User updateUser(@PathVariable("id") int id ,@RequestBody User user){
        this.userService.updateUser(id,user);
        return user;

    }


}

package org.example.student.Controller;

import org.example.student.entity.User;
import org.example.student.repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UserRepositry userRepositry;

    @PostMapping("/register")
    public String register(@RequestBody User user){
        user.save(user);
        return "User registered successfully";
    }
}

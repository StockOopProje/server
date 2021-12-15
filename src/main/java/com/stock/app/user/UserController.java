package com.stock.app.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/getUser")
    public User getUser(@RequestParam("name") String name){
        return userService.getUser(name);
    }

    @PostMapping(path="/saveUser")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}

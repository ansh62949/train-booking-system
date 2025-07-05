package com.train.booking.com.train.booking.Controller;



import com.train.booking.com.train.booking.Entity.*;
import com.train.booking.com.train.booking.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser (@RequestBody User user) {
        User newUser  = userService.registerUser (user);
        return ResponseEntity.ok(newUser );
    }
}

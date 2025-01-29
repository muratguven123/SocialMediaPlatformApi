package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getUser();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @PutMapping("/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable int id) {
        return userService.updateUser(newUser, id);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUserById(id);
    }


}

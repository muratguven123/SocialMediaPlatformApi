package controller;

import model.user_subreddits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserSubredditsService;

import java.util.List;

@RestController
@RequestMapping("/user_subreddits")
public class UserSubredditsController {
    @Autowired
    private UserSubredditsService userSubredditsService;
    @GetMapping()
    public List<user_subreddits> getUserSubreddits() {
        return userSubredditsService.getUserSubreddits();
    }
    @GetMapping("/id")
    public user_subreddits getUserSubredditsById(@RequestParam int id) {
        return userSubredditsService.getUserSubredditsbyid(id);
    }
    @PostMapping
    public user_subreddits createUserSubreddits(@RequestBody user_subreddits subreddits) {
        return userSubredditsService.addUserSubreddits(subreddits);
    }
    @DeleteMapping("/id")
    public void deleteUserSubredditsById(@RequestParam int id) {
        userSubredditsService.deleteUserSubreddits(id);
    }
}

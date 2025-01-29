package controller;

import model.subreddits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.subredditsService;

import java.util.List;

@RestController
@RequestMapping("/subreddits")
public class subredditsController {
    @Autowired
    private subredditsService subredditService;

    @GetMapping("/all")
    public List<subreddits> getSubreddits() {
        return subredditService.getSubreddits();
    }
    @PostMapping("/add")
    public subreddits addSubreddits(@RequestBody subreddits subreddits) {
        return subredditService.addSubreddits(subreddits);
    }
    @GetMapping("/title")
    public subreddits getSubredditsByTitle(String title) {
        return subredditService.getSubredditsByTitle(title);
    }
    @GetMapping("/postid")
    public subreddits findByPostid(int postid) {
        return subredditService.findByPostid(postid);
    }
    @GetMapping("/title{title}/post{postid}")
    public subreddits findByTitleAndPostid(String title, int postid) {
        return subredditService.findByTitleAndPostid(title, postid);
    }
    @GetMapping("/postid/{postid}/comment/{commentid}")
    public subreddits findByComment(@PathVariable int postid, @PathVariable int commentid) {
        return subredditService.findByComment(postid, commentid);
    }
   @GetMapping("/title")
    public subreddits findByTitle(String title) {
        return subredditService.findByTitle(title);
   }
}

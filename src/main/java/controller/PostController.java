package controller;

import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PostService;

import java.util.List;

@RestController
@RequestMapping("/Post")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/all")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }
    @PostMapping("/create")
    public Post createPost(@RequestParam String title, @RequestParam String content) {
        return postService.createPost(title, content);
    }
    @PutMapping("/update")
    public Post updatePost(@RequestParam int id, @RequestParam String title, @RequestParam String content) {
        return postService.updatePost(id, title, content);
    }
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable int id) {
        postService.deletePost(id);
    }

}

package service;

import model.Post;
import org.springframework.stereotype.Service;
import repository.PostRepository;

import java.util.List;
@Service
public class PostService {
    public PostRepository postRepository;
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public Post getPostById(int id) {
        return postRepository.getReferenceById(id);
    }
    public Post createPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return postRepository.save(post);
    }
    public Post updatePost(int id, String title, String content) {
        Post existingPost = postRepository.findById(id).orElse(null);
        if (existingPost != null) {
            existingPost.setTitle(title);
            existingPost.setContent(content);
            return postRepository.save(existingPost);
        } else {
            return null;
        }
    }
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }

}

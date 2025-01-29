package controller;

import model.comments;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import service.CommentService;

import java.util.List;
import java.util.Optional;

@Component
@RequestMapping("/comment")
@RestController
public class CommentController {

private CommentService commentService;
public CommentController(CommentService commentService) {
    this.commentService = commentService;
}
@GetMapping("{commentid}")
public List<comments> getComments() {
    return commentService.getComments();
}
@GetMapping
    public List<comments> getComments(@RequestParam int postid, @RequestParam int commentid) {
    return (List<comments>) commentService.getCommentsByPostidAndCommentİd(postid,commentid);
}
@PostMapping
    public comments addComment(@RequestBody comments comment) {
    return commentService.addComment(comment);
}
@PutMapping("{commentid}")
    public comments updateComment(@PathVariable int commentid, @RequestBody comments comment) {
    return commentService.updateComment(comment,commentid);
}
@DeleteMapping("/{commentid}")
    public void deleteComment(@PathVariable int commentid) {
     commentService.deleteComment(commentid);
}


}

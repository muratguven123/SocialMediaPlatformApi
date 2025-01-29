package service;

import model.Post;
import org.springframework.stereotype.Service;
import repository.CommnetsRepository;
import model.comments;
import javax.xml.stream.events.Comment;
import java.util.List;
@Service
public class CommentService {
    private CommnetsRepository commnetsRepository;
    public CommentService(CommnetsRepository commnetsRepository) {
        this.commnetsRepository = commnetsRepository;
    }
    public List<comments> getComments() {
        return commnetsRepository.findAll();
    }
    public comments getCommentByid(int id) {
        return commnetsRepository.getReferenceById(id);
    }
    public comments addComment(comments comment) {
        return commnetsRepository.save(comment);
    }
    public comments updateComment(comments comment,Integer id) {
        comments existingcomment = commnetsRepository.findById(id).orElse(null);
        if (existingcomment != null) {
            existingcomment.setCommentId(comment.getCommentId());
            existingcomment.setPostId(comment.getPostId());
            existingcomment.setUserId(comment.getUserId());
            return commnetsRepository.save(existingcomment);
        } else {
            return null;
        }
    }
    public void deleteComment(int id) {
        commnetsRepository.deleteById(id);
    }
    public comments getCommentsByPostidAndCommentİd(int postid, int commentid) {
        return commnetsRepository.getCommentsByPostidAndCommentİd(postid, commentid);
    }
    }


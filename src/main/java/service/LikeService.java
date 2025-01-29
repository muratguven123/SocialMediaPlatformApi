package service;

import model.Like;
import org.springframework.stereotype.Service;
import repository.LikeRepository;

import java.util.List;

@Service
public class LikeService {
    private LikeRepository likeRepository;
    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }
    public List<Like> getLikes() {
        return likeRepository.findAll();
    }
    public Like getLike(int id) {
        return likeRepository.getReferenceById(id);
    }
    public Like createLike(Like like) {
        return likeRepository.save(like);
    }
    public Like updateLike(Like like) {
        Like oldLike = likeRepository.getReferenceById(like.getId());
        if (oldLike != null) {
            oldLike.setId(oldLike.getId());
        }
        return likeRepository.save(like);
    }
    public void deleteLike(int id) {
        likeRepository.deleteById(id);
    }
    public Like findByUserAndLike(Integer userid, Integer likeid){
        return likeRepository.findByUserAndLike(userid, likeid);
    }
    public Like findByPostidAndLike(int postid, int likeid) {
        return likeRepository.findByPostidAndLike(postid, likeid);
    }
    public Like findByCommentAndLike(int commentid, int likeid) {
        return likeRepository.findByCommentAndLike(commentid, likeid);
    }
}

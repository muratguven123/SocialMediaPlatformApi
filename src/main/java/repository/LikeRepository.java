package repository;

import model.Like;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;

public interface LikeRepository extends JpaRepository<Like, Integer> {
    Like findByUserAndLike(Integer userid, Integer likeid);
    Like findByCommentAndLike(Integer commentid, Integer likeid);
    Like findByPostidAndLike(Integer postid, Integer likeid);
}

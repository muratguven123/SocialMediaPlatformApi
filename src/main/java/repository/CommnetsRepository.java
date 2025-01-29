package repository;

import model.comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommnetsRepository extends JpaRepository<comments,Integer> {
    comments getCommentsByPostidAndCommentİd(int postid,int commentid);


}

package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.subreddits;
public interface SubredditsRepostitory extends JpaRepository<subreddits, Integer> {
    subreddits findByTitle(String title);
    subreddits findByPostid(int postid);
    subreddits findByTitleAndPostid(String title, int postid);
    subreddits findByPostidAndTitle(int postid, String title);
    subreddits findByComment(int postid,int commentid);


}

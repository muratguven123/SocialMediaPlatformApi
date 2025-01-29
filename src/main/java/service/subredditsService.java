package service;

import model.subreddits;
import org.springframework.stereotype.Service;
import repository.SubredditsRepostitory;

import java.util.List;
@Service
public class subredditsService {
    public SubredditsRepostitory subredditsRepostitory;
    public subredditsService(SubredditsRepostitory subredditsRepostitory ) {
        this.subredditsRepostitory = subredditsRepostitory;
    }
    public List<subreddits> getSubreddits() {
        return subredditsRepostitory.findAll();
    }
    public subreddits getSubredditsById(int id) {
        return subredditsRepostitory.getReferenceById(id);
    }
    public subreddits addSubreddits(subreddits subreddits) {
        return subredditsRepostitory.save(subreddits);
    }
    public void deleteSubreddits(int id) {
        subredditsRepostitory.deleteById(id);
    }
    public subreddits updateSubreddits(subreddits subreddits,int id) {
        subreddits subreddits1 = subredditsRepostitory.findById(id).get();
        if(subreddits1 !=null){
            subreddits.setSubredditId(subreddits1.getSubredditId());
            subreddits.setName(subreddits1.getName());
            subreddits.setDescription(subreddits1.getDescription());
        }
        return subredditsRepostitory.save(subreddits);
    }
    public subreddits getSubredditsByTitle(String title) {
        return subredditsRepostitory.findByTitle(title);
    }
    public subreddits findByPostid(int postid) {
        return subredditsRepostitory.findByPostid(postid);
    }
    public subreddits findByTitle(String title) {
        return subredditsRepostitory.findByTitle(title);
    }
    public subreddits findByTitleAndPostid(String title, int id) {
        return subredditsRepostitory.findByTitleAndPostid(title, id);
    }
    public subreddits findByComment(int postid,int commentid) {
        return subredditsRepostitory.findByComment(postid,commentid);
    }

}

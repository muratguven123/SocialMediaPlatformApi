package service;

import model.user_subreddits;
import org.springframework.stereotype.Service;
import repository.userSubredditsRepository;

import java.util.List;

@Service
public class UserSubredditsService {
    private userSubredditsRepository userSubredditsRepository;
    public UserSubredditsService(userSubredditsRepository userSubredditsRepository) {
        this.userSubredditsRepository = userSubredditsRepository;
    }
    public List<user_subreddits> getUserSubreddits() {
        return userSubredditsRepository.findAll();
    }
    public user_subreddits getUserSubredditsbyid(int id) {
        return userSubredditsRepository.findById(id).orElse(null);
    }
    public user_subreddits addUserSubreddits(user_subreddits userSubreddits) {
        return userSubredditsRepository.save(userSubreddits);
    }
    public void deleteUserSubreddits(int userSubreddits_id) {
        userSubredditsRepository.deleteById(userSubreddits_id);

    }
}

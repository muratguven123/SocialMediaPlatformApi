package service;

import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private static UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getUser() {
        return userRepository.findAll();
    }
    public User getUserById(int id) {
        return userRepository.getReferenceById(id);
    }
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(User NewUser,Integer id) {
        Optional user = userRepository.findById(id);
        if (user.isPresent()) {
            User foundUser = (User) user.get();
            foundUser.setUserId(NewUser.getUserId());
            foundUser.setUsername(NewUser.getUsername());
            foundUser.setUsername(NewUser.getUsername());
            foundUser.setEmail(NewUser.getEmail());
            foundUser.setPasswordHash(NewUser.getPasswordHash());
        }
        return userRepository.save(NewUser);
    }
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}

package repository;

import model.user_subreddits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userSubredditsRepository extends JpaRepository<user_subreddits, Integer> {
}

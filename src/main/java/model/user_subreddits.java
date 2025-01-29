package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.subreddits;


@Entity
@Table(name = "user_subreddits")
@Data
@Setter
@Getter
public class user_subreddits {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private User userId;
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private subreddits subredditId;;

    public subreddits getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(subreddits subredditId) {
        this.subredditId = subredditId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}

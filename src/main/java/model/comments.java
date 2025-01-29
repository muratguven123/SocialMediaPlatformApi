package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.xml.stream.events.Comment;


@Entity
@Table(name = "comments")
@Data
@Getter
@Setter
public class comments {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private User userId;
    @jakarta.persistence.Id
    @GeneratedValue
    @ManyToOne
    private Post postId;
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer commentId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}

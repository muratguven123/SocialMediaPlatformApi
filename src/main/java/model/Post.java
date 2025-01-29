package model;

import jakarta.persistence.*;
import lombok.*;
import model.Like;
import org.springframework.data.annotation.Id;

import java.util.Collection;

@Entity
@Table(name="post")
@Data
@Getter
@Setter
public class Post {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postid;


    @ManyToOne
    @JoinColumn(name = "userid", foreignKey = @ForeignKey(name = "fk_userid"))
    public User userid;
    @Column(name = "Title")
    private String title;
    @Column(name = "subreddits")
    private String content;
    @Column(name = "PostDate")
    private String postDate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }
}


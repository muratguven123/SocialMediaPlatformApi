package controller;

import model.Like;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import service.LikeService;

import java.util.List;

@RequestMapping("/like")
@RestController
@Component
public class LikeController {
    private LikeService likeService;
    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }
    @GetMapping("{likeid}")
    public List<Like> getLike(){
        return likeService.getLikes();
    }
    @GetMapping
    public Like getLike(@PathVariable int likeid){
        return likeService.getLike(likeid);
    }
    @GetMapping("/user/{userid}/like/{likeid}")
    public Like getLikeByUserAndLike(@PathVariable Integer userid, @PathVariable Integer likeid) {
        return likeService.findByUserAndLike(userid, likeid);
    }
    @GetMapping("/post/{postid}/like/{likeid}")
    public Like getLikeByPostAndLike(@PathVariable int postid, @PathVariable int likeid) {
        return likeService.findByPostidAndLike(postid, likeid);
    }
    @GetMapping("/comment/{commentid}/like/{likeid}")
    public Like getLikeByCommentAndLike(@PathVariable int commentid, @PathVariable int likeid) {
        return likeService.findByCommentAndLike(commentid, likeid);
    }

    @PostMapping
    public Like addLike(@RequestBody Like like){
        return likeService.createLike(like);
    }
    @PutMapping("{likeid}")
    public Like updateLike(@RequestBody Like like){
        return likeService.updateLike(like);
    }
    @DeleteMapping("{likeid}")
    public void deleteLike(@PathVariable int likeid){
        likeService.deleteLike(likeid);
    }
}

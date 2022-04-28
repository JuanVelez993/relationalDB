package com.sofkaU.relationalDB.controller;


import com.sofkaU.relationalDB.entity.Comment;
import com.sofkaU.relationalDB.entity.Post;
import com.sofkaU.relationalDB.service.PostServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class PostController {
    @Autowired
    private PostServiceImplementation service;

    @GetMapping("")
    public List<Post> getAllPosts(){
        return service.findAllPost();
    };

    @PostMapping
    public Post createPost(@RequestBody Post post){
        return service.createPost(post);
    };

    @PostMapping
    public Post createComment(@RequestBody Comment comment){
        return service.createComment(comment);
    };

    @DeleteMapping
    public void deletePost(@RequestBody Post post){
        service.deletePost(post);
    };

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment){
        service.deleteComment(comment);
    };

}

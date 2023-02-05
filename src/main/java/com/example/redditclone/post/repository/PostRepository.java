package com.example.redditclone.post.repository;

import com.example.redditclone.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class PostRepository implements JpaRepository<Post,Long> {
}

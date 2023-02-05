package com.example.redditclone.post.model;

import com.example.redditclone.abstractentity.models.AbstractEntity;
import com.example.redditclone.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reddit_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @NotNull
    private User user;

    @NotNull
    @NotBlank(message = "Please, add content to your post")
    @Column(name = "content")
    private String content;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "upvote")
    private Long upVote;






}

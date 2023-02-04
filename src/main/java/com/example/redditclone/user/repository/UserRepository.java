package com.example.redditclone.user.repository;

import com.example.redditclone.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class UserRepository implements JpaRepository<User,Long> {

}

package com.example.redditclone.user.repository;

import com.example.redditclone.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class UserRepository implements JpaRepository<User,Long> {

}

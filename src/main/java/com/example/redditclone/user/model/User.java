package com.example.redditclone.user.model;

import com.example.redditclone.abstractentity.models.AbstractEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name = "reddit_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractEntity {
    @NotNull
    @NotBlank(message = "Please,set your first name")
    @Column(name = "first_name")
    String firstName;

    @NotNull
    @NotBlank(message = "Please,set your last name")
    @Column(name = "last_name")
    String lastName;

    @NotNull
    @NotBlank(message = "Please,set your password")
    @Column(name = "password")
    String password;

    @NotNull
    @NotBlank(message = "Please,set your phone number")
    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;

}

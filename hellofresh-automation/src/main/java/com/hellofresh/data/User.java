package com.hellofresh.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String email;
    private String password;

    public User getUser() {
        return new User("user@hellofersh.com","qwerty");
    }
}
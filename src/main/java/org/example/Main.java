package org.example;

import org.example.Classes.User;
import org.example.Classes.LoginSystem;

public class Main {

    public static void main(String[] args) {
        User user = new User("lucagavra", "password");

        LoginSystem loginSystem = new LoginSystem(user);

        loginSystem.login();
    }
}

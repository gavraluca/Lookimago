package org.example.Classes;

public class User {

    private String username;
    private String password;

    // Constructor to initialize username and password
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Get username
    public String getUsername() {
        return username;
    }

    // Set username
    public void setUsername(String username) {
        this.username = username;
    }

    // Set password
    public void setPassword(String password) {
        this.password = password;
    }

    // Check if username and password match
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

package org.example.Classes;

import java.util.Scanner;

public class LoginSystem {

    private User user;

    public LoginSystem(User user) {
        this.user = user;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);

        // Introduce username
        System.out.print("Username: ");
        String introducedUsername = scanner.nextLine();

        // Introduce password
        System.out.print("Password: ");
        String introducedPassword = scanner.nextLine();

        // Verify credentials
        if (user.login(introducedUsername, introducedPassword)) {
            System.out.println("Login successful! Welcome, " + introducedUsername + "!");
        } else {
            System.out.println("Invalid username or password. Make sure you enter a valid username and password.");
        }

        scanner.close();
    }
}

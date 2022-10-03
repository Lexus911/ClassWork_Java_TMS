package com.example.lib;
//interface
public class TestInterface implements IAuth {
    static boolean isUserLoggedIn = false;

    public static void main(String[] args) {
        TestInterface lesson6 = new TestInterface();
        if (!isUserLoggedIn) lesson6.login();

    }

    @Override
    public void login() {
        isUserLoggedIn = true;
        System.out.println("user logged in");
    }

    @Override
    public void logout() {
        isUserLoggedIn = false;
        System.out.println("user logged out");

    }
}

interface IAuth{
    void login();
    void logout();
}

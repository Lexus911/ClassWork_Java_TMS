package com.example.lib;

public class Interface_Constants implements IAuthorization {
    public static void main(String[] args) {
        Interface_Constants interface_constants = new Interface_Constants();
        interface_constants.login(userIsNotLoggedIn);
    }

    @Override
    public void login(boolean isUserIsLoggedIn) {
        if(isUserIsLoggedIn){
            System.out.println("user is logged in");
        }
        if(!isUserIsLoggedIn){ //if принимая boolean ожидает true
            System.out.println("user is not logged in");
        }
    }
}

interface IAuthorization{
    boolean userIsNotLoggedIn = false; // this is constant (can't be changed)
    boolean isUserIsLoggedIn = true; // this is constant (can't be changed)
    void login (boolean isUserIsLoggedIn);
}
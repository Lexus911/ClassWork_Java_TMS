package com.example.lib;

public class RepositoryImpl implements IRepository{
    @Override
    public void login(String userName, String password) {
        System.out.println("send login request");
    }
}

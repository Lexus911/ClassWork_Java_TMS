package com.example.lib;

public class Lesson7_1 {

    static IRepository iRepository = new IRepository() {  //реализация анонимного класса как интерфейса
        @Override
        public void login(String userName, String password) {//тело анонимного класса
            System.out.println("hello");
        }
    };

    static Anonym anonym = new Anonym(){//анонимный класс
        @Override
        void hackNetwork() {
            super.hackNetwork(); // родительское поведение
            System.out.println("child hacked the world"); // переопределение метода родительского класса
        }
    };

    public static void main(String[] args) {
        iRepository.login("abc","123");
        anonym.hackNetwork();
    }
}
class Anonym{
    void hackNetwork(){
        System.out.println("I hacked the world");
    }
}
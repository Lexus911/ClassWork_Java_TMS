package com.example.lib;

public class Lesson7 {
    final String open = "open";//константы
    final String close = "close";

    static IRepository iRepository;
    public static void main(String[] args) {
        iRepository = new RepositoryImpl(); //инициализация интерфейса через класс в который он имплементирован
        iRepository.login("abc","123");

        Shop shop = Shop.CLOSE;
        switch (shop){
            case OPEN:
                System.out.println("Shop is open");
                break;
            case CLOSE:
                System.out.println("Shop is closed");
                break;
        }

    }

}
enum Shop{
    OPEN,
    CLOSE
}
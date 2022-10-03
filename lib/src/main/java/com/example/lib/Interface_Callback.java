package com.example.lib;
//обртный вызов метода
public class Interface_Callback {
    public static void main(String[] args) {
        Button button = new Button(new LoginClickListener());// передаём класс который имплементит интерфейс
        button.buttonClicked();
    }
}
class LoginClickListener implements IAuthorization1{ // класс который реализует интерфейс
    @Override
    public void sendLoginRequest() { //отправка запроса на сервер
        System.out.println("Login request was successfully sent...");
    }
}

interface IAuthorization1{// интерфейс, который должен отправить запрос на сервер
    void sendLoginRequest();
}

class Button{
    IAuthorization1 iAuthorization1;
    public Button(IAuthorization1 action){// конструктор принимающий интерфейс
        this.iAuthorization1 = action;//инициализация интерфейса
    }
    void buttonClicked(){//нажатие кнопки, вызов метода интерфейса
        iAuthorization1.sendLoginRequest();
    }
}
package Week7;

import java.util.HashMap;
import java.util.Scanner;

//не уверен что ты пытался тут реализовать, нужно было идти по пунктам задания: создать класс BankMenu, в нем методы и т.д.

//Мне кажется, что следующим заданием будет внедрение службы такси..
public class Bank {
    public void start() {
        Scanner s = new Scanner(System.in);
        System.out.println("Все операторы сейчас заняты. Пожалуйста, подождите...\n");
       // try {
       //     Thread.sleep(0);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        HashMap<String, String> user = new HashMap<>();
        user.put("Alex", "123");
        System.out.println("Привет! Я твой личный помочник. Что тебя интересует? (Выбери нужное)\n 1.Войти\n 2.Зарегистрироваться\n 3.Выйти");
        int logOrReg = s.nextInt();
        while (logOrReg != 3) {
            System.out.println("Введите логин:");
            String email = s.nextLine();
            if (user.containsKey(email)) {
                System.out.println("Введите пароль:");
                String password = s.nextLine();
                if (user.containsValue(email)) {
                    System.out.println("С возвращением!");
                }
            } else {
                System.out.println("Пользователь не найден\nПовторите попытку:");
                System.out.println("Введите логин:");
                email = s.nextLine();

            }



        }

















    }
}

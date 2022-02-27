package week4;

import java.util.Scanner;

// мы делаем полноценное приложение, этот класс лучше назвать как-то осмысленно, вроде CoffeeShop
public class Task1_1 {
    public static void main(String[] args) {
        //в конце ты не закрываешь этот сканнер
        Scanner sc = new Scanner(System.in);
        // здесь пользвателю будет непонятно что от него ждут что он введет цифру. Лучше ему об этом явно написать
        //я немного переписал нижнюю строку чтобы ты понимал как будет лучше
        System.out.println("Из какого вы города?(Выбрать нужное:\n1.Moscow\n2.NewYork\n3.Minsk\n4.Kiev)");
        int town = sc.nextInt();
        //то же самое и с выбором кофе
        System.out.println("Выберите один из предложенных вариантов кофе: latte, espresso, cappuccino, coffee with milk");
        int coffee = sc.nextInt();
        if (town == 1) {
            //переменные должны называться с маленькой буквы
            Moscow Moscow = new Moscow();
            if (coffee == 1){
                //вызов метода waiting должен происходить изнутри методов latte, espresso и тд
                //это позволит очистить вызывающий код и перенести эту логику внутрь самих классов
                Moscow.waiting();
                Moscow.latte();
            } else if (coffee == 2) {
                Moscow.waiting();
                Moscow.espresso();
            } else if (coffee == 3) {
                Moscow.waiting();
                Moscow.cappuccino();
            } else if (coffee == 4) {
                Moscow.waiting();
                Moscow.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 2) {
            NewYork NewYork = new NewYork();
            if (coffee == 1){
                NewYork.waiting();
                NewYork.latte();
            } else if (coffee == 2) {
                NewYork.waiting();
                NewYork.espresso();
            } else if (coffee == 3) {
                NewYork.waiting();
                NewYork.cappuccino();
            } else if (coffee == 4) {
                NewYork.waiting();
                NewYork.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 3) {
        Minsk Minsk = new Minsk();
            if (coffee == 1){
                Minsk.waiting();
                Minsk.latte();
            } else if (coffee == 2) {
                Minsk.waiting();
                Minsk.espresso();
            } else if (coffee == 3) {
                Minsk.waiting();
                Minsk.cappuccino();
            } else if (coffee == 4) {
                Minsk.waiting();
                Minsk.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 4) {
            Kiev Kiev = new Kiev();
            if (coffee == 1){
                Kiev.waiting();
                Kiev.latte();
            } else if (coffee == 2) {
                Kiev.waiting();
                Kiev.espresso();
            } else if (coffee == 3) {
                Kiev.waiting();
                Kiev.cappuccino();
            } else if (coffee == 4) {

                Kiev.waiting();
                Kiev.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }

        } else {
            System.out.println("Ошибка!");
        }








    }
}

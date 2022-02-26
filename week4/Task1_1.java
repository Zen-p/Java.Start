package week4;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Из какого вы города?(Выбрать нужное: Moscow, NewYork, Minsk, Kiev)");
        int town = sc.nextInt();
        System.out.println("Выберите один из предложенных вариантов кофе: latte, espresso, cappuccino, coffee with milk");
        int coffee = sc.nextInt();
        if (town == 1) {
            Moscow Moscow = new Moscow();
            if (coffee == 1){
                Moscow.latte();
            } else if (coffee == 2) {
                Moscow.espresso();
            } else if (coffee == 3) {
                Moscow.cappuccino();
            } else if (coffee == 4) {
                Moscow.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 2) {
            NewYork NewYork = new NewYork();
            if (coffee == 1){
                NewYork.latte();
            } else if (coffee == 2) {
                NewYork.espresso();
            } else if (coffee == 3) {
                NewYork.cappuccino();
            } else if (coffee == 4) {
                NewYork.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 3) {
        Minsk Minsk = new Minsk();
            if (coffee == 1){
                Minsk.latte();
            } else if (coffee == 2) {
                Minsk.espresso();
            } else if (coffee == 3) {
                Minsk.cappuccino();
            } else if (coffee == 4) {
                Minsk.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 4) {
            Kiev Kiev = new Kiev();
            if (coffee == 1){
                Kiev.latte();
            } else if (coffee == 2) {
                Kiev.espresso();
            } else if (coffee == 3) {
                Kiev.cappuccino();
            } else if (coffee == 4) {
                Kiev.coffee_with_milk();
            } else {
                System.out.println("Ошибка!");
            }

        } else {
            System.out.println("Ошибка!");
        }








    }
}

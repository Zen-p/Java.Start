package Week_4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Из какого вы города?(Выбрать нужное:\n1.Moscow\n2.NewYork\n3.Kiev");
        int town = sc.nextInt();
        System.out.println("Выберите один из предложенных вариантов кофе: latte, espresso, cappuccino");
        int coffee = sc.nextInt();
        sc.close();
        if (town == 1) {

            MoscowCoffeeShop moscow = new MoscowCoffeeShop();
            if (coffee == 1) {
                moscow.MakeLatte();
            } else if (coffee == 2) {
                moscow.MakeEspresso();
            } else if (coffee == 3) {
                moscow.MakeCappuccino();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 2) {
            NewYorkCoffeeShop newyork = new NewYorkCoffeeShop();
            if (coffee == 1) {
                newyork.MakeLatte();
            } else if (coffee == 2) {
                newyork.MakeEspresso();
            } else if (coffee == 3) {
                newyork.MakeCappuccino();
            } else {
                System.out.println("Ошибка!");
            }
        } else if (town == 4) {
            KievCoffeeShop kiev = new KievCoffeeShop();
            if (coffee == 1) {
                kiev.MakeLatte();
            } else if (coffee == 2) {
                kiev.MakeEspresso();
            } else if (coffee == 3) {
                kiev.MakeCappuccino();
            } else {
                System.out.println("Ошибка!");
            }
        } else {
            System.out.println("Ошибка!");
        }
    }
}
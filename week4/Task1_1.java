package week4;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Из какого вы города?(Выбрать нужное: Moscow, NewYork, Minsk, Kiev)");
        int town = sc.nextInt();
        if (town == 1) {
            Moscow Moscow = new Moscow();
            Moscow.makeCoffee();
        } else if (town == 2) {
            NewYork NewYork = new NewYork();
            NewYork.makeCoffee();
        } else if (town == 3) {
        Minsk Minsk = new Minsk();
        Minsk.makeCoffee();
        } else if (town == 4) {
            Kiev Kiev = new Kiev();
            Kiev.makeCoffee();
        }








    }
}

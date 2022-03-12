package Week_4;

import java.util.Scanner;

public abstract class MakeCoffee {
    Scanner sc = new Scanner(System.in);
    public String name;

    public MakeCoffee(String name, int whatTypeOfCoffee) {
        this.name = name;
    }


    public void makeLatte() {
        Waiting();
        System.out.printf("Thanks for order in %s, take your latte. Bye!", name);
        }
    public void makeCappuccino() {
        Waiting();
        System.out.printf("Thanks for order in  %s, take your cappuccino. Bye!", name);
        }
    public void makeOther() {
        Waiting();
        System.out.printf("Thanks for order in %s, take our other. Bye!", name);
        }

    public static void Waiting() {
        System.out.println("Wait a minute...");
    }
}

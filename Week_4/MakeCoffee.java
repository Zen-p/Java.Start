package Week_4;

import java.util.Scanner;

public abstract class MakeCoffee {
    //в этом классе не используется сканнер, поэтому его тут незачем создавать
    Scanner sc = new Scanner(System.in);
    public String name;

    public MakeCoffee(String name, int whatTypeOfCoffee) {
        this.name = name;
        if (whatTypeOfCoffee == 1) {
            makeLatte();
        } else if (whatTypeOfCoffee == 2) {
            makeCappuccino();
        } else {
            makeOther();
        }
    }


    public void makeLatte() {
        Waiting();
        System.out.printf("Thanks for order in %s, take your latte. Bye!\n", name);
        }
    public void makeCappuccino() {
        Waiting();
        System.out.printf("Thanks for order in  %s, take your cappuccino. Bye!\n", name);
        }
    public void makeOther() {
        Waiting();
        System.out.printf("Thanks for order in %s, take our other. Bye!\n", name);
        }

    //этот метод не должен быть статическим
    //имя методов должно быть с маленькой буквы
    public static void Waiting() {
        System.out.println("Wait a minute...");
    }
}

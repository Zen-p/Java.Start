package Week_4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Из какого вы города?\nВыбрать нужное:\n1.Moscow\n2.NewYork\n3.Kiev\n");
            int answerAboutCity = sc.nextInt();
            System.out.println("\nВыберите один из предложенных вариантов кофе: \n1.latte \n2.cappuccino \n3.other");
            int answerAboutCoffee = sc.nextInt();

            switch (answerAboutCity) {
                case 1:
                    new MoscowCoffeeShop("Moscow", answerAboutCoffee);
                    continue;
                case 2:
                    new NewYorkCoffeeShop("NewYork", answerAboutCoffee);
                    continue;
                case 3:
                    new KievCoffeeShop("Kiev", answerAboutCoffee);
                    continue;}



        }



    }
}
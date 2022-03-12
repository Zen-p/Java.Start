package Week_4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Из какого вы города?(Выбрать нужное:\n1.Moscow\n2.NewYork\n3.Kiev");
        int answerAboutCity = sc.nextInt();
        System.out.println("Выберите один из предложенных вариантов кофе: latte, cappuccino, other");
        int answerAboutCoffee = sc.nextInt();
        sc.close();
        switch (answerAboutCity) {
            case 1:
                new MoscowCoffeeShop("Moscow", answerAboutCoffee);
                break;
            case 2:
                new NewYorkCoffeeShop("NewYork", answerAboutCoffee);
                break;
            case 3:
                new KievCoffeeShop("Kiev", answerAboutCoffee);
                break;
        }
    }
}
package Week_4;

public class NewYorkCoffeeShop {
    public void MakeLatte () {
        Waiting();
        System.out.println("Thanks for order in NewYork, take your latte. Bye!");
    }

    public void MakeEspresso () {
        Waiting();
        System.out.println("Thanks for order in NewYork, take your espresso. Bye!");
    }

    public void MakeCappuccino() {
        Waiting();
        System.out.println("Thanks for order in NewYork, take your cappuccino. Bye!");

    }

    public void Waiting () {
        System.out.println("Wait a minute...");
    }
}

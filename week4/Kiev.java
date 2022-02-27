package week4;

import static java.lang.Thread.*;

public class Kiev {
    //не хватает правильно расставленных модификаторов доступа. В данном случае этот метод будет public
    //названия мтодов должны быть глаголами и обозначать какое-то действие. latte -> makeLatte
    void latte() {
        // вот здесь должен вызываться метод waiting
        System.out.println("Thanks for order in Kiev, take your latte. Bye!");
    }
    void espresso() {
        System.out.println("Thanks for order in Kiev, take your espresso. Bye!");
    }
    void cappuccino () {
        System.out.println("Thanks for order in Kiev, take your cappuccino. Bye!");
    }
    void coffee_with_milk() {
        System.out.println("Thanks for order in Kiev, take your coffee with milk. Bye!");
    }
    //так как все вызовы этого метода будут внутри этого класса то можно сделать его private
    void waiting (){
        System.out.println("Wait a few seconds:");
    }



}

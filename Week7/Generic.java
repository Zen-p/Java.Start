package Week7;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        //Попытка создания чего-то похожего не дженерик
        ArrayList <Integer> newList = new ArrayList<>();//Integer - класс-обертка
        newList.add(1);
        newList.add(14);
        //newList.add("Hello") - ошибка

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));



        }


    }
}

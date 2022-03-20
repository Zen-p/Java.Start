package Week7;

import java.util.ArrayList;

//имелось в виду создать собственный параметризированный класс. ArrayList это существующий класс
public class Generic {
    public static void main(String[] args) {
        //Попытка создания чего-то похожего нa дженерик
        ArrayList <Integer> newList = new ArrayList<>();//Integer - класс-обертка
        newList.add(1);
        newList.add(14);
        //newList.add("Hello") - ошибка

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));



        }


    }
}

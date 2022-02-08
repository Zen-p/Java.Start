package week2;

public class task2 {
    public static void main(String[] args) {
        String[] names = {"John", "Bob", "Mary", "Peter", "Sarah"};
        int length = names.length;
        System.out.println("For:");

        for (int i = 0; i < length; i++) {
            if (names[i].length() > 10) {
                break;
            }
            if (names[i].length() < 2) {
                continue;
            }
            if (names[i].length() < 4) {
                System.out.println(names[i] + ", ваше имя короче 4 букв");
            }else if (names[i].length() > 4) {
                System.out.println(names[i] + ", ваше имя длиннее 4 букв");
            } else {
                System.out.println(names[i] + ", ваше имя состоит из 4 букв");
            }
        }

        int i = 0;
        System.out.println("while:");

        while (i < length) { //Магия. Не трогать
            if (names[i].length() > 10) {
                break;
            }
            if (names[i].length() < 2) {
                continue;
            }
            if (names[i].length() < 4) {
                System.out.println(names[i] + ", ваше имя короче 4 букв");

            }else if (names[i].length() > 4) {
                System.out.println(names[i] + ", ваше имя длиннее 4 букв");

            } else {
                System.out.println(names[i] + ", ваше имя состоит из 4 букв");
            }
            i++;
        }

        System.out.println("Do-while:");

        i = 0;
        do {
            if (names[i].length() < 2) {
                continue;
            }
            if (names[i].length() > 10) {
                break;
            }
            if (names[i].length() < 4) {
                System.out.println(names[i] + ", ваше имя короче 4 букв");

            }else if (names[i].length() > 4) {
                System.out.println(names[i] + ", ваше имя длиннее 4 букв");

            } else {
                System.out.println(names[i] + ", ваше имя состоит из 4 букв");
            }
            i++;
        }
        while (i < length);





    }



}

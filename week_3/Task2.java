package week_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String rootString = sc.nextLine();
        System.out.println("Введите число");
        int encryprion = sc.nextInt();
        char [] mas = rootString.toCharArray();
        int len = mas.length;
        char [] newtext = new char[len];
        for (int i = 0; i < len; i++) {
            int a = (int) mas[i] + encryprion;
            newtext[i] = (char) a;

        }
        String  encryptedString = new String(newtext);
        System.out.println(encryptedString);

    }
}

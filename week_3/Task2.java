package week_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char [] symbol = text.toCharArray();
        String newText = sc.nextLine();
        char[] shifr = newText.toCharArray();
        System.out.println("Введите число:");
        int x = sc.nextInt();


        for (int i = 0; i < shifr.length; i++) {
            System.out.print(shifr[i+x]);
        }//Ума не приложу что не так





    }
}

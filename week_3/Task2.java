package week_3;

import java.sql.SQLOutput;
import java.util.Scanner;

// тут тоже все хорошо! единственное, я добавил переносы строк, разделив код на логические абзацы, так читается лучше
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


        StringBuffer encryptedString = new StringBuffer(newtext.length);
        for (int i = 0; i < len; i++) {
            int a = (int) mas[i] + encryprion;
            newtext[i] = (char) a;
            encryptedString.append(newtext[i]);
        }
        


        System.out.println(encryptedString);
        System.out.print("Исходное сообщение: " + rootString + "\nзашифрованное сообщение: " + encryptedString + "\nшифр: " + encryprion);

    }
}

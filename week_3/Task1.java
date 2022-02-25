package week_3;

import java.util.Scanner;

// тут все отлично!
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 5 чисел:");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = s.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println("Число x - четное");
            } else {
                System.out.println("Число x - нечетное");
            }
        }


    }
}



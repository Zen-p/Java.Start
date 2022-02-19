package week_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 5 чисел:");
        int[] nums = new int[5];
        nums[0] = s.nextInt();
        nums[1] = s.nextInt();
        nums[2] = s.nextInt();
        nums[3] = s.nextInt();
        nums[4] = s.nextInt();

        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println("Число x - четное");
            } else {
                System.out.println("Число x - нечетное");
            }
        }

    }
}



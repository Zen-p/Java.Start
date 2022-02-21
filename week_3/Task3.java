package week_3;

import java.util.Scanner;

// исходный массив не сортируется. при тесте с использованием чисел 1, -1, 0 на консоль выводит 1 1
// молодец, что попытался сделать, погугли и попытайся решить эту задачу с помощью пузырьковой сортировки и сортировки выбором

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int count = sc.nextInt();
        int [] nums = new int[count];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Новый список:");
        for (int i = 0; i < count; i++) {
            if (i != count -1){
                if (nums[i] > nums[i+1]){
                    nums[i+1] = nums[i];
                    System.out.println(nums[i]);

                }
            }

        }

    }
}

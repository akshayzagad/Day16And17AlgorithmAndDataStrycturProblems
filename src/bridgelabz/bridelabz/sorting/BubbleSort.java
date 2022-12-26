package bridgelabz.bridelabz.sorting;

import java.util.Scanner;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();
        System.out.println("Enter the size of array");
        int arraySize = scanner.nextInt();
        System.out.println("Enter the values in array");
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        sort.printArray(sort.bubbleSort(array));
    }


}

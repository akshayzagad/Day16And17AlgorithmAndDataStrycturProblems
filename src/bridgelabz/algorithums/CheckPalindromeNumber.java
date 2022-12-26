package bridgelabz.algorithums;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main (String[]args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("This is prime number ");
        int lower = 2, upper = 1000;
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i))
                // System.out.println(i);
                arrayList.add(i);
        }
        System.out.println(arrayList);
        palindrome((arrayList));
    }

    static boolean isPrime (int n)
    {
        int count = 0;
        if (n < 2)
            return false;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }
    public static void palindrome( ArrayList<Integer> arrayList){
        System.out.println("this is palindrome ");
        for (int i = 0 ; i<arrayList.size();i++) {
            int rev = 0;
            int rem;
            int temp = arrayList.get(i);
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (arrayList.get(i) == rev) {
                System.out.println( arrayList.get(i));
            }
        }

    }
}

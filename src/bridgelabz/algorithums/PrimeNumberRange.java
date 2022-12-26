package bridgelabz.algorithums;

import java.util.Scanner;

public class PrimeNumberRange {
    public boolean checkPrimeNumber(int check){
        int count=0;
        for (int i=1;i<=check;i++)
        if (check%i==0){
            count++;
        }if(count==2){
            return true;
        }else
        return false;
    }
    public void checkRange(int startNum,int lastNum){
        for (int i=startNum;i<=lastNum;i++){
           boolean result= checkPrimeNumber(i);
            if (result){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Start Number: ");
        System.out.println("Enter the End Number: ");
        Scanner scanner = new Scanner(System.in);
        int Start_Number = scanner.nextInt();
        int End_Number = scanner.nextInt();
        PrimeNumberRange primeNumbers=new PrimeNumberRange();
        primeNumbers.checkRange(Start_Number,End_Number);
    }
}


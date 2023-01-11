package javaHomworkCLASS4;

import java.util.Scanner;

/*Write a programme to input any number and check if it is prime or not.
        (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
        17... are the prime numbers.)*/
public class Que7 {
    public static void main(String[] args) {
        int num, count = 0;
        System.out.println("Enter the Number :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            if (num%i==0){
                count++;

            }
        }
        if (count==2)
            System.out.println("Input Number is Prime Number");
        else
            System.out.println("Input Number is not Prime Number");
    }
}
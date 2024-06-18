// 1. Program to take 5 values from the user and store them in an array.

import java.util.Scanner;

public class input{
    public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of the array ");
          int size = sc.nextInt();
          int arr[]=new int[size];
          System.out.println("enter the elemnt in array");
          for(int i=0;i<=size-1;i++)
          {
            arr[i]=sc.nextInt();
          }
        
        //   output
        System.out.println("output of array ");
        for(int n:arr)
        {
            System.out.println(n);
        }

    }
}


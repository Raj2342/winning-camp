// Write a C Program to  Addition of All Elements of the Array

import java.util.Scanner;

public class additon_in_array {
    public static void main(String[] args) {
         
          int result=0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array");
          int size = sc.nextInt();
          int arr[] = new int[size];
          System.out.println("Enter the array element ");
          for(int i=0;i<=size-1;i++)
          {
            arr[i]=sc.nextInt();
          }
          for(int i=0;i<=size-1;i++)
          {
              result += arr[i];
          }
          System.out.println(result);

    }
}

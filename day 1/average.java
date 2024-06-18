// 2. Program to find the average of n numbers using arrays  
/*
 soln- 1. a[5]= 10,20,30,40,50---> 150
  2. avg= 150/5;
 */
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
          double result =0;
          double finalResult =0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no. of  average of element ");
          int navavg = sc.nextInt();
          System.out.println("Enter the  size of array ");
          int size = sc.nextInt();
          int  arr[]= new int[size];
          System.out.println("Enter the element in array ");
          for(int i=0;i<=size-1;i++)
          {
              arr[i]=sc.nextInt();
          }
          System.out.println("output");
          for(int i=0;i<=arr.length-1;i++){
             result = result+arr[i];
          }
          finalResult=result/size;
          System.out.println(finalResult);

    }
}

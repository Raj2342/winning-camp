import java.lang.*;
import java.util.*;
public  class calculator{


    public static void main(String[] args) {
            int first=0,second=0,choice=0, result=0;
        
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("CALCULATOR");
            System.out.println("1:addition +");
            System.out.println("2:substraction -");
            System.out.println("3:multiplication *");
            System.out.println("4:division /");
          System.out.println("choose you operation what you want to perform");
          choice=sc.nextInt();
          switch(choice){
            case 1:
            System.out.println("Addition perform");
            System.out.println("Enter first no.");
             first=sc.nextInt();
            System.out.println("Enter second no.");
             second=sc.nextInt();
             result=first+second;
            System.out.println("result of addition"+" "+result);
            break;

            case 2:
            System.out.println("substraction perform");
            System.out.println("Enter first no.");
             first=sc.nextInt();
            System.out.println("Enter second no.");
             second=sc.nextInt();
             result=first-second;
            System.out.println("result of substraction"+" "+result);
            break;
            
             case 3:
             System.out.println("multiplication perform");
             System.out.println("Enter first no.");
              first=sc.nextInt();
             System.out.println("Enter second no.");
              second=sc.nextInt();
              result=first*second;
             System.out.println("result of multiplication"+" "+result);
             break;

             case 4:
             System.out.println("division perform");
             System.out.println("Enter first no.");
              first=sc.nextInt();
             System.out.println("Enter second no.");
              second=sc.nextInt();
              result=first/second;
             System.out.println("result of division"+" "+result);
             break;

             
             
             }
            
             System.out.println("Do you want to continue? (y/n):");
         char    continueChoice = sc.next().charAt(0);      
         }
         while (continueChoice == 'y' || continueChoice == 'Y');

         System.out.println("Program closed.");
         sc.close();
          


        }    
        
    }



import java.util.*;

public class Loops5 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
          System.out.println("*****  Welcome to Calculator ******");
          System.out.println(" 1: Addition of two numbers");
          System.out.println(" 2: Subtraction of two numbers");
          System.out.println(" 3: Multiplication of two numbers");
          System.out.println(" 4: Division of two numbers");
          System.out.println(" 5: Go for exit ");
          System.out.println("Enter your choice");
          choice = sc.nextInt();

          switch (choice) {
            case 1: 
                 System.out.println(" Enter your first number");
                 int sum1 = sc.nextInt();
                 System.out.println(" Enter your second number");
                 int sum2 = sc.nextInt();
                 int sum = sum1 + sum2;
                 System.out.println("The sum of two number is =  " + sum);
            break;

            case 2:
            System.out.println(" Enter your first number");
            int a = sc.nextInt();
             System.out.println(" Enter your second number");
            int b = sc.nextInt();
            int c = a - b ;
            
            System.out.println(" Subtraction of two numbers =" + c);
            break;

            case 3: 
            System.out.println(" Enter your first number");
            int d = sc.nextInt();
             System.out.println(" Enter your second number");
            int e= sc.nextInt();
            int multi = d * e ;
            System.out.println(" Multiplication of two numbers is = "  +  multi);
            break;

            case 4:
            System.out.println(" Enter your first number");
            int f = sc.nextInt();
             System.out.println(" Enter your second number");
            int g = sc.nextInt();
            int div = f / g;
            if (g == 0 ){
                System.out.println(" invalid input " + " Please enter a valid number ");
            } else {
            System.out.println(" Division of two numbers is = " + div); 
            }
            break;

            case 5: 
        
            System.out.println(" your's choise is to exit ");
            break;

            default:
                System.out.println("invalid choice");
                break;

          }
             
        }while (choice !=5);
          
    }
}

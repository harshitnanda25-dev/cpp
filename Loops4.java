import java.util.*;

public class Loops4 {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int num;
      do {
        System.out.println(" Please enter a number 1 to 50:");
         num = sc.nextInt();

        if ( num < 1 || num > 50){
            System.out.println("invalid number");
        }
      } while (num <1 || num > 50);
      System.out.println("You have entered " + num + " and this is a valid number");


    }
}

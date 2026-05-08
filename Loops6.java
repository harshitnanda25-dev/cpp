import java.util.*;

public class Loops6 {
    
    public static void main( String args[]){
   
//    print 10*10 mulitplacation //
   
        // for (int i = 1 ; i <=10; i++){
    //     for (int j = 1; j <=10; j++){
    //         System.out.print(i*j + "    ");
    //     }
    //     System.out.println();
    // }

    // * pattern matrix using for loops //
    Scanner sc = new Scanner(System.in);

     System.out.println(" Enter first number ");
     int a = sc.nextInt();

     System.out.println(" Enter second number ");
     int b = sc.nextInt();

    // for ( int i = 1; i<=a ; i++){
    //     for (int j = 1 ; j<=b; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    int i= 1; 
    while (i<=a){
    int j = 1;
    while (j<=b){
        System.out.print("*");
        j++;
        
    }
    System.out.println();
    i++;
    }

    }

}
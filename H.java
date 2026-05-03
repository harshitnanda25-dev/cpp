import java.util.*;

public class H {
     public static void main(String args[]){

    // //  Calculator using switch case. //

    //  Scanner sc = new Scanner(System.in);
    //  int a = sc.nextInt();
    //  int b = sc.nextInt();

    //  int c = sc.nextInt();

    // switch (c){
    //     case 1 : 
    //     System.out.println(a+b );
    //     break; 
    //     case 2 : 
    //     System.out.println(a-b);
    //     break;
    //     case 3 : 
    //     System.out.println(a*b);
    //     break;
    //     case 4 : 
    //     System.out.println(a/b);
    //     break; 
    //     default : 
    //     System.out.println("invalid input");
    // }


    // Day in a week //

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();

    // switch (a) {
    //    case 1 :
    //     System.out.println("Monday");
    //     break;
    //     case 2 : 
    //     System.out.println("Tuesday");
    //     break; 
    //     case 3 : 
    //     System.out.println("Wednesday");
    //     break;
    //     case 4 : 
    //     System.out.println("Thursday");
    //     break;
    //     case 5 : 
    //     System.out.println("Friday");
    //     break;
    //     default : 
    //     System.out.println("out of syllabous ");
    //     break;
    // }


//    // Menu-driven (Square / Cube) //

//     Scanner sc = new Scanner(System.in );
//     int num = sc.nextInt();
//     int button = sc.nextInt();

//     switch (button) {
//         case 1 : 
//         System.out.println( num * num );
//         break;
//         case 2 : 
//         System.out.println( num * num * num );
//         break;
//         case 3 : 
//         System.out.println(" Exit ");
//         break;
//         default : 
//         System.out.println(" Invalin input ");
//         break;
//     }
 
   // Job eligiblity criteria //

    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    // String qualification = "graduate";

     
    // if ( age >= 18 ) {
    //     if ( qualification.equals("graduate") ) {
    //         System.out.println(" You are eligigble ");
    //     } else  {
    //         System.out.println(" You are not eligible ( qualification) ");
    //     }
    //     } else {
    //         System.out.println(" You are not eligible ( underage ) ");
    //     }


     char ch = 'A';

     if ( ( ch >= 'A' && ch <= 'B') || ( ch >= 'a' && ch <= 'z') ) {
        System.out.println(" Alphabets");
     } else if ( ch >= '0' && ch <= '9') {
        System.out.println(" digits ");

     } else {
        System.out.println(" special characters");
     }

    }
   }
  



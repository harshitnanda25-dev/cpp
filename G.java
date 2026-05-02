import java.util.*;

public class G {
     public static void main(String args[]){

    // Check whether a number is even or odd.  //
    //     int a = 10 ;
    //     if ( a%2 ==0){
    //         System.out.println("even");
    //     } else {
    //             System.out.println("odd");
    //         }
    //     }
    
    //  }


//     // Check whether a number is positive, negative, or zero.  //
// int a = -5;
  
// if ( a>0)  {
//     System.out.println("positive");
// } else if ( a < 0 ) {
//     System.out.println("negative");
// } else if ( a ==0 ) {
//     System.out.println("zero");
//    }
//   }
// }

// // Compare two numbers and print which one is greater.  //
// int a = 10 ; int b =30; 
// if ( a > b ) {
//     System.out.println(" a is greater than b ");
// } else if ( a < b ) {
//     System.out.println("a is smaller than b")
// }


// // check whether a year is a leap year or not.  //
// int year = 2038; 
// if ( year % 4 ==0 && year % 100!=0 || year % 400 ==0) {
//     System.out.println("leap year");
// }
//         else {
//             System.out.println("not a leap year");
//         }
//     }
// }

      Scanner sc = new Scanner(System.in);
      char vovel = sc.next().charAt(0);
    // char vovel = 'a';
      if ( vovel == 'a' || vovel == 'e' || vovel == 'i' || vovel == 'o' || vovel == 'u' ) {
        System.out.println("it is a vovel");
      } else {
        System.out.println("it is a constant ");
      }

     }
    }
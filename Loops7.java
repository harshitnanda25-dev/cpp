import java.util.*;

public class Loops7 {
    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();

        boolean isPrime = true; 

        for (int i =2; i<a; i++){
            if (a % i == 0){
                isPrime = false;
                break;

            }
        }
        if ( isPrime == true){
            System.out.println("  ! Prime number !   ");
        }else {
            System.out.println(" ! Not prime ! ");
        }

    }
}
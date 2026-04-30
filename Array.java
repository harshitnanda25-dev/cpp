import java.util.*;

public class Array{

    public static void main (String args []){
      int marks [] [] = new int [3][3];
       marks [0][0] = 35; // maths
      marks [0][1] = 40; 
      marks [0][2] = 90;
      marks [1][0] = 40;
      marks [1][1] = 60;
      marks [1][2] = 75;
      marks [2][0] = 45;
      marks [2][1] = 65;
      marks [2][2] = 95;

      for (int row =0 ; row < 3 ; row++){
        for (int col =0 ; col < 3 ; col++){
            System.out.println(marks [row][col]);
        }
        System.out.println();
      }
    }
    
}


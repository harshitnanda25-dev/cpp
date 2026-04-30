import java.util.*;

public class F {
    public static void main( String args []){
      
       int [][] marks = { 
            { 50 },
            {60, 80},
            {50,60,80}
        };

        for (int row =0 ; row <marks.length; row++){
            for (int col =0; col < marks[row].length; col++){
                System.out.print(marks [row] [col]+ " ");
            }
        System.out.println();
        }
      }
    } 
    


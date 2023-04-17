import java.util.*;

public class HW23_4 {
    public static void main(String[] args) {
        System.out.println(numberSpiral(1,20000));
             
    }

    static int numberSpiral(int column, int row) { //coordinates are given as (column, row)
        if(column >= row) {
            if(column % 2 == 0) {
                int startingNumber = findColumn(column);

                return startingNumber - row + 1;
            } 
            else {
                int startingNumber = findColumn(column-1);
                return startingNumber  + row;
            }
        }

        else {
            if(row % 2 == 0) {

                int startingNumber = findRow(row -1);
                return startingNumber + column;
            } 
            else {
                int startingNumber = findRow(row);
                return startingNumber - column + 1;
            }
        }
    }

    static int findRow(int x) {
        if(x == 1) {
            return 1;
        }  
        else {
            int returnThis = 2*x + 2*(x-1) -2 + findRow(x-2);
            return returnThis;
        }
    }

    static int findColumn(int x) {
        if(x == 0) {
            return 0;
        }
        else {
            int returnThis = 2*x + 2*(x-1) -2 + findColumn(x-2);
            return returnThis;
        } 
    }
}

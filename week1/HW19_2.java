/*
     CIST 004B1 Spring 2023
     HW week 1 problem 1
     Description: Finds the highest element in a 2D array
     Input: none.
     Output: Integer 
     Student: Benyamin Ha
     Known bugs: none.
     Date: 02.02.2023
*/

public class HW19_2 {
  public static void main(String[] args) {
    Integer[][] numbers = { {1, 2, 3}, {4, 4, 6}
    };
    System.out.println(max(numbers));
  }

  public static <E extends Comparable<E>> E max(E[][] list) {
    E max = list[0][0];
    for(int row = 0; row < list.length; row++) {
      for(int col = 0; col < list[row].length; col++) {
        if(list[row][col].compareTo(max) > 0) {
          max = list[row][col];
        }
      }
    }
    return max;
  } 

}
///6
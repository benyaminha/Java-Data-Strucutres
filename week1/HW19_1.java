/*
     CIST 004B1 Fall 2020
     HW week 1 problem 1
     Description: This program creates an arraylist of items by removing any duplicates.
     Input: none.
     Output: an array list of items with no duplicates.
     Student: Benyamin Ha
     Known bugs: none.
     Date: 02.02.2023
*/
import java.util.ArrayList;

public class HW19_1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(14);
    list.add(42);
    list.add(25);
    
    ArrayList<Integer> newList = removeDuplicates(list);
    
    System.out.print(newList);
  }

  public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
    ArrayList<E> duplicatesRemoved = new ArrayList<>();

    for(int i = 0; i<list.size(); i++) {
      if(!duplicatesRemoved.contains(list.get(i))) {
        duplicatesRemoved.add(list.get(i));
      }
    }
    return duplicatesRemoved;
  }
}

///[14, 24, 42, 25]

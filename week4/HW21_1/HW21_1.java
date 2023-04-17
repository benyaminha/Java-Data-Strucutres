
/*
     CIST 004B1 Fall 2022
     HW week 4 problem 1
     Description: Performs hashset operations
     Input: none.
     Output: String
     Student: Benyamin Ha
     Known bugs: none.
     Date: 02.25.2023
*/
import java.util.*;
public class HW21_1 {
    public static void main(String[] args) {
        String[] names1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] names2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(names1));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(names2));
        
        getUnion(set1, set2);

        Set<String> set3 = new LinkedHashSet<>(Arrays.asList(names1));
        Set<String> set4 = new LinkedHashSet<>(Arrays.asList(names2));
        getDifference(set3, set4);
        
        Set<String> set5 = new LinkedHashSet<>(Arrays.asList(names1));
        Set<String> set6 = new LinkedHashSet<>(Arrays.asList(names2));
        getIntersection(set5, set6);
        
            }

    public static void getUnion(Set<String> a, Set<String> b) {
        a.addAll(b);
        System.out.println("Union: " + a);
    }

    public static void getDifference(Set<String> a, Set<String> b) {
        Set<String> aClone = new LinkedHashSet<>();
        aClone.addAll(a);
        aClone.retainAll(b);
        a.removeAll(aClone);
        b.removeAll(aClone);
        a.addAll(b);
        
        System.out.println("Difference: " + a);
    }

    public static void getIntersection(Set<String> a, Set<String> b){
        a.retainAll(b);
        System.out.println("Intersection: " + a);
    } 
}

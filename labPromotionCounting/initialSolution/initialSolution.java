import java.util.*;
public class initialSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> before = new ArrayList<Integer>(); 
        ArrayList<Integer> after = new ArrayList<Integer>();

        before.add(input.nextInt());
        after.add(input.nextInt());
        before.add(input.nextInt());
        after.add(input.nextInt());
        before.add(input.nextInt());
        after.add(input.nextInt());
        before.add(input.nextInt());
        after.add(input.nextInt());
       
        int[] promotions = getNumOfPromotions(before, after); 
        
        for(int i = 0; i < 4; i++) {
            System.out.println(promotions[i]);
        }
        
    }

    public static int[] getNumOfPromotions(ArrayList<Integer> before, ArrayList<Integer> after) {
        int difference = after.get(3) - before.get(3); 
        int[] solution = new int[3]; 
        solution[3] = difference;
        
        for(int i = 2; i <= 0 ; i--) {
            if(after.get(i) == before.get(i)) {
                solution[i] = difference; 
            }
            else {
                difference = after.get(i) - before.get(i); 
                solution[i] = difference; 
            }
            
        }

        return solution;
    }
}

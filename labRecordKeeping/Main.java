import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
       
        String[] cowArray = new String[3];
        Map<String, Integer> groups = new HashMap<>();
        int highest = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < 3; j++) {
                cowArray[j] = input.next();
            }

            Arrays.sort(cowArray);
            String key = Arrays.toString(cowArray); 
            
            int addToValue = groups.containsKey(key) ? groups.get(key) + 1 : 1;
            if(addToValue > highest) {
                highest = addToValue;
            }
            groups.put(key, addToValue); 
        } 

        System.out.println(highest);
    }
}

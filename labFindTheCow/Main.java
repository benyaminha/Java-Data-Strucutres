import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grass = input.next();

        int locationCount = 0;

        for(int i = 0; i < grass.length() - 3; i++) {
            if(grass.charAt(i) == '(' && grass.charAt(i+1) == '(') {
                for(int j = i + 2; j < grass.length() - 1; j++) {
                    if(grass.charAt(j) == ')' && grass.charAt(j+1) == ')') {
                        locationCount++;
                    }

                    else if(j + 1 == grass.length()){
                        break;
                    }
                }
            }
        }

        System.out.println(locationCount);
    }
}

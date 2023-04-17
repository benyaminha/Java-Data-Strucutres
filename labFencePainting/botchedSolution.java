package labFencePainting;

import java.util.Scanner;


public class botchedSolution {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int[] fence = new int[4];
        fence[0] = input.nextInt();
        fence[1] = input.nextInt();
        fence[2] = input.nextInt();
        fence[3] = input.nextInt();
    
        int a = fence[0], b = fence[1], c = fence[2], d = fence[3];

        String[] order = new String[4];
        order[0] = "a";
        order[1] = "b";
        order[2] = "c";
        order[3] = "d";

        int index = 0;
        String swapOrder;
        
        for(int i = 0; i < 4; i++) {
        int lowestValue = 101;
            for(int j = i; j < 4; j++) {
                if (fence[j] <= lowestValue){
                    lowestValue = fence[j];
                    index = j;
                }
            }
            lowestValue = fence[index];
            fence[index] = fence[i];
            fence[i] = lowestValue;
            swapOrder = order[index];
            order[index] = order[i];
            order[i] = swapOrder;
        }

        String finalOrder = order[0] + order[1] + order [2] + order[3];
        System.out.println(finalOrder);
        for(int i = 0; i <= 3; i++) {
            System.out.println(fence[i]);
        }

        switch(finalOrder){
            case "abcd":
                System.out.println((b-a) + (d-c));
                break;
            case "acbd": 
                System.out.println((b-a+d-c)- b+c);
                break;
            case "acdb": 
                System.out.println(b-a);
                break;
            case"cadb":
                System.out.println((b-a+d-c)-d+a);
                break;
            case"cdba":
                System.out.println(b-a+d-c);
                break;
            case"cabd":
                System.out.println(d-c);
                break;
        }
        
    }    

    
}

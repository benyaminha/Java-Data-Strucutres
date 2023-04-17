package labFencePainting;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
    
        if ((c >  b) || (d < a)) {
            System.out.println((b - a)+ (d - c));
        }
        else {
            int lowerFence = a > c ? c : a;
            int upperFence = b > d ? b : d;
            System.out.println(upperFence - lowerFence);   
        }
    }    
}

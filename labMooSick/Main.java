import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();   
        int[] song = new int[N]; 
        for(int i = 0; i < N; i++) {
            song[i] = input.nextInt();
        }
        
        int c = input.nextInt();
        int[] chord = new int[c]; 
        for(int i = 0; i < c; i++) {
            chord[i] = input.nextInt();
        }
        Arrays.sort(chord);

//        int N = 6;
//        int[] song = new int[]{1,8,5,7,9,10};
//        int c = 3;
//        int[] chord = new int[]{4,6,7};
//        Arrays.sort(chord);
//

        int[] intervals = new int[c-1];
        for(int i = 0; i < c-1; i++) {
            intervals[i] = Math.abs(chord[i+1] - chord[i]);
        }

        int k = 0;
        ArrayList<Integer> chordIndex = new ArrayList<Integer>();
        int[] potentialChord = new int[c];

        boolean isChord = true;
        for(int i = 0; i <= N - c; i++) {
            for(int j = 0; j < c; j++) {
                potentialChord[j] = song[i + j];
            }
            Arrays.sort(potentialChord);

            for(int j = 0; j < c-1; j++) {
                if(potentialChord[j+1] - potentialChord[j] != intervals[j]) {
                    isChord = false;
                    break;
                }
            }
            
            if(isChord) {
                k++;
                chordIndex.add(i+1);
            }
            else{
                isChord = true;
            }
            
            
        }

        System.out.println(k);

        for(int i : chordIndex) {
            System.out.println(i);
        }
    }
}

import java.util.*;

public class HW23_2 {
    public static void main(String [] args) {
        int NUM_OF_INTEGERS = 1000000;
        Integer[] array = new Integer[NUM_OF_INTEGERS]; 
        Random random = new Random();     
        
        for(int i = 0; i < NUM_OF_INTEGERS; i++) {
            array[i] = random.nextInt(NUM_OF_INTEGERS);
        }

        radixSort(array);

        for(int i : array) {
            System.out.println(array[i]);
        }
    }

    static void radixSort(Integer[] array) {
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        //initialize buckets
        for(int i = 0; i < 10; i++) {
            bucket.add(new ArrayList<Integer>());
        }
        //find max amt of digits
        int maxDigits = (int)array[0];
        for(int i = 0; i < array.length; i++) {
            if (maxDigits < array[i]) {
            }
        }

        int maxNumOfDigits = String.valueOf(maxDigits).length();
        //put numbers into buckets 
        for(int i = 0; i < maxNumOfDigits; i++) {
            for(Integer j : array) {
                int current = getRadix(i, j);
                
                bucket.get(current).add(j); 
            }
            // put buckets back into list, clear buckets
            int k = 0;
            for(int j = 0; j < 10; j++) {
                if(bucket.get(j) != null) {
                    for(int l = 0; l < bucket.get(j).size(); l++) {
                        array[k++] = bucket.get(j).get(l);
                    }
                    bucket.get(j).clear();
                }    
            }
        }
    }

    static int getRadix(int position, Integer n) {
        // position is distance from last digit
        String nString = n.toString(); 
        
        if(nString.length() - 1 - position < 0) {
            return 0;
        }
        else {
            int returnValue = Character.getNumericValue(nString.charAt(nString.length() - 1 - position));
            return(returnValue);
        }
    }
}

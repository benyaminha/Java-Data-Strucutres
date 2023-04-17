/*
     CIST 004B1 Fall 2022
     HW week 2 problem 3
     Description: Solves binomial coefficients recusively and iteratively. 
     Input: none.
     Output: String 
     Student: Benyamin Ha
     Known bugs: none.
     Date: 02.11.2023
*/
public class BinomialCoefficients {
    public static void main(String[] args) {
        System.out.println("Recursive: " + cr(6,2));           
        System.out.println("Iterative: " + ci(6,2));
    }

    public static int cr(int n, int k) {
        if (k==0 || n == k) {
            return 1;
        }
        else{
            return cr(n-1, k-1) + cr(n-1,k);
        }
    }

    public static int ci(int n, int k) {
        int denominator = 1;
        int x = n - k;
        int solution = 1;
        for( ; x > 0; x--) {
           denominator *= x; 
        }
        for( ; k > 0; k--) {
            denominator *= k;
        }
        for( ; n > 0; n--) {
            solution *= n; 
        }
        return solution/denominator;    
    }
}

// Recursive: 15 
// Iterative: 15 




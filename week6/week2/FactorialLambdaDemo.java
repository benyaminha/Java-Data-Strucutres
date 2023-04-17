/*
     CIST 004B1 Fall 2022
     HW week 2 problem 2
     Description:  Uses lambda expression to find the factorial of a numnber
     Input: none.
     Output: String 
     Student: Benyamin Ha
     Known bugs: none.
     Date: 02.11.2023
*/
interface NumericFunc {
    int func(int n);
}
class FactorialLambdaDemo {
    public static void main(String args[]) {
        NumericFunc factorial = n -> {
            if(n ==0){
                return 1; 
            }
            else { 
                int y = n;
                for(; n > 1 ;n--) {
                    y *= (n-1);    
                }

                return y;
            }  
        };
        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 5 is " + factorial.func(5));
        System.out.println("The factoral of 9 is " + factorial.func(9));
    }
}

// The factoral of 3 is 6
// The factoral of 5 is 120
// The factoral of 9 is 362880


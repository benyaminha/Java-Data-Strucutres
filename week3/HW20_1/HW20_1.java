import java.util.*;
public class HW20_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> operands = new Stack<Integer>();
        
        String expressionString = input.nextLine();
        Stack<Character> expression = new Stack<Character>();
        for(int i = expressionString.length()-1; i >= 0; i--) {
            if(expressionString.charAt(i) != ' '){
                expression.push(expressionString.charAt(i)); 
            }
        }

        while(!expression.isEmpty()) {

        int op1 = 0;
        int op2 = 0;
            if(expression.peek() == '+') {
                op1 = expression.pop();
                
                op1 = operands.pop();
                op2 = operands.pop();

                operands.push(op1 + op2);
            }
            else if(expression.peek() == '-') {
                op1 = expression.pop();
                op1 = operands.pop();
                op2 = operands.pop();

                operands.push(op2 - op1);
            }

            else if(expression.peek() == '*') {
                op1 = expression.pop();
                op1 = operands.pop();
                op2 = operands.pop();
                
                operands.push(op2 * op1);
            }

            else if(expression.peek() == '/') {
                op1 = expression.pop();
                op1 = operands.pop();
                op2 = operands.pop();

                operands.push(op2/op1);
            }

            else{
                op1 = Character.getNumericValue(expression.pop());
                operands.push(op1);
            }

        }
        
       System.out.println(operands.pop()); 

    } 
}

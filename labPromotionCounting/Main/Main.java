import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] before = new int[4];
		int[] after = new int[4]; 
		
		before[0] = input.nextInt();
		after[0] = input.nextInt();
		before[1] = input.nextInt();
		after[1] = input.nextInt();
		before[2] = input.nextInt();
		after[2] = input.nextInt();
		before[3] = input.nextInt();
		after[2] = input.nextInt();

		int[] solution = new int[3];
		solution[2] = after[3] - before[3];
 	
		
		for(int i = 1; i >=0; i--) {
			solution[i] = after[i+1] - (before[i+1] - solution[i+1]);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(solution[i]); 
		}
	}
}

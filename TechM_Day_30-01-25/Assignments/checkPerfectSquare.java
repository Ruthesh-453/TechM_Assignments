package arrays;
import java.util.Scanner;

public class checkPerfectSquare {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        boolean isPerfectSquare = isPerfectSquare(number);

	        System.out.println(isPerfectSquare ? "TRUE" : "FALSE");
	        
	        scanner.close();
	    }
	    
	    public static boolean isPerfectSquare(int num) {
	        int sqrt = (int) Math.sqrt(num); 
	        return sqrt * sqrt == num; 
	    }
}

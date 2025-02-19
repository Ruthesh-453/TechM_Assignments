package arrays;
import java.util.Scanner;

public class reverse_number {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversed = 0,digit;

        while (number > 0) {
            digit = number % 10;  
            reversed = reversed * 10 + digit; 
            number /= 10;  
        }
        
        System.out.println(reversed);
        
        scanner.close();
    }
}

package arrays;
import java.util.Scanner;


public class oddPositions {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = "";
        for (int i = 1; i < input.length(); i += 2) { 
            result += input.charAt(i);
        }

        System.out.println(result);
        
        scanner.close();
    }
}

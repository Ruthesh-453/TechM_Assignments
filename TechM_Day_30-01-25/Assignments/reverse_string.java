package arrays;

import java.util.Scanner;

public class reverse_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = scan.nextLine().toLowerCase();
		
		String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        System.out.println(reversed);
        
        scan.close();
	}
}

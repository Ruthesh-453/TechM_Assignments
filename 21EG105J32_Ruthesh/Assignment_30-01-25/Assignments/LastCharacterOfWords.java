package arrays;
import java.util.Scanner;

public class LastCharacterOfWords {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
    
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
        	
            if (!word.isEmpty()) {
        
                for (int i = word.length() - 1; i >= 0; i--) {
                    char ch = word.charAt(i);
                    if (Character.isDigit(ch)) {
                        break; 
                    }else if (Character.isLetter(ch)) {
                        result.append(ch);  
                        break;  
                    }
                }
            }
        }
        
        System.out.println(result.toString());
    }
}
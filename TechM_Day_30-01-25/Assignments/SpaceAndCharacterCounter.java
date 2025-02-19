package arrays;

import java.util.Scanner;

public class SpaceAndCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        
        int spaceCount = 0;
        int charCount = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                continue; 
            } else if (ch == ' ') {
                spaceCount++;
            } else {
                charCount++;
            }
        }
        
        System.out.println("No of spaces : " + spaceCount + " and characters : " + charCount);
    }
}

package arrays;

import java.util.*;

public class SmallestVowel {
    public static char findSmallestVowel(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char smallest = Character.MAX_VALUE; 

        for (char c : s.toCharArray()) {
            if (vowels.contains(c) && c < smallest) {
                smallest = c;
            }
        }

        return (smallest == Character.MAX_VALUE) ? '-' : smallest; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase(); 
        scanner.close();

        char result = findSmallestVowel(input);
        if (result == '-') {
            System.out.println("No vowels found");
        } else {
            System.out.println(result);
        }
    }
}

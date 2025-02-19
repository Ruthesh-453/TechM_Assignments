package arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Unique_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scan.nextLine().toLowerCase();

       LinkedHashSet<Character> uniqueChar=new LinkedHashSet<>();
       
       for(int i=0;i<input.length();i++) {
    	   char ch = input.charAt(i);
    	   uniqueChar.add(ch);
       }
       
       for (char ch : uniqueChar) {
           System.out.print(ch);
       }
        scan.close();
    }
}


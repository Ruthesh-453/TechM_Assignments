package org1;
import java.util.Scanner;

public class task5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder modifiedString = new StringBuilder();
        for(int i=0;i<input.length();i++) {
        	char ch=input.charAt(i);
        	
        	if(i%2==0) {
        		modifiedString.append(Character.toUpperCase(ch));
        	}else {
        		modifiedString.append(Character.toLowerCase(ch));
        	}
        }
        System.out.print(modifiedString);
	}
}

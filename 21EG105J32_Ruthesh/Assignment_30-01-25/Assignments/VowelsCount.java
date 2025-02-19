package arrays;
import java.util.Scanner;

public class VowelsCount {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String input;
		int vowels=0, consonants=0;
		System.out.println("Enter a string: ");
		input=scan.nextLine();
		
		input=input.toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			if (ch>='a' && ch<='z') {
				if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
			
		}
		System.out.println("Vowels count: "+vowels);
		System.out.println("Consonants count: "+consonants);
		scan.close();
	}
}

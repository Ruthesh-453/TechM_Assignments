package exceptions_package;

import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Error: The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();

        try {
            checkEvenNumber(num);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}


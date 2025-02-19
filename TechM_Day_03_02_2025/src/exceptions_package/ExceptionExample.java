package exceptions_package;

public class ExceptionExample {
	    public static void main(String[] args) {
	        try {
	            int a = 10, b = 0;
	            int result = a / b; 
	            System.out.println(result);
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero: " + e.getMessage());
	        }
	    }

}

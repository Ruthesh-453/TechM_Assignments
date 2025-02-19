package arrays;
import java.util.*;

public class dataTransmission {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter sequence of numbers: ");
        String input = scanner.nextLine().trim();
        
        input = input.substring(0, input.length() - 1);
        
        String[] numbers = input.split(" ");
        
        List<Integer> primes = new ArrayList<>();
        
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        
        Collections.sort(primes);
        
        int totalPrimes = primes.size();
        int secondLargestPrime = primes.get(primes.size() - 2);
        
        System.out.println(totalPrimes + secondLargestPrime);
        
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

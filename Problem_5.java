import java.util.*;

public class Main {
    
    
    static List<Integer> primeNumbers(int num) {
        List<Integer> myPrimes = new ArrayList<>(); 
        
        // number is greater than 2?
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            
            // checking whether it is a prime number or not
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            
            if (isPrime) {
                myPrimes.add(i);
            }
        }
        return myPrimes;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        
        
        List<Integer> primes = primeNumbers(number);
        System.out.println(primes); 
    }
}

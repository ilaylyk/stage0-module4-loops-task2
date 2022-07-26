package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for (int n = 2; n <= printToInclusive; n++) {
            boolean isPrime = true;
            double squareRoot = Math.sqrt(n) + 1;
            int r = 2;
            while (r <= squareRoot && isPrime) {
                if (n % r == 0) isPrime = false;
                r++;
            }
            if (n == 2){
                System.out.println(n);
            } else if (isPrime){
                System.out.println(n);
            }
        }
    }
}

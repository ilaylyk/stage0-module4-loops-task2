package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int n = 0;
        while (printToInclusive >= n) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println(result);
            n += 1;
            result = 1;
        }
    }
}

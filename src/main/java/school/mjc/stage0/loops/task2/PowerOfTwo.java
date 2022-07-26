package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        if (power >= 0) {
            while (counter <= power) {
                System.out.println((int) Math.pow(2, counter));
                counter++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}

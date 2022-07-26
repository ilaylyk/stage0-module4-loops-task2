package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        multiplyByAndToInclusive = multiplyByAndToInclusive * 5;
        if (multiplyByAndToInclusive != 0) {
            if (multiplyByAndToInclusive > 0){
            while (multiplyByAndToInclusive >= i) {
                if (i % 5 == 0) {
                    System.out.println(i);
                    i += 5;
                }
            }
            } else {
                while (multiplyByAndToInclusive <= i) {
                    if (i % 5 == 0) {
                        System.out.println(i);
                        i -= 5;
                    }
                }
            }
        }
    }
}

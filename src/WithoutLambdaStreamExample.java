import java.util.concurrent.TimeUnit;

public class WithoutLambdaStreamExample {
    public static void main(String[] args) {

        long start = System.nanoTime();

        System.out.println("Even numbers: ");
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {

                System.out.println(i);

            }

        }

        System.out.println("\nOdd numbers: ");
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }

        }

        long end = System.nanoTime();
        long elapsedTime = end - start;

        System.out.println("Execution time for both loops using forloop: " + elapsedTime + " nanoseconds.");

    }
}

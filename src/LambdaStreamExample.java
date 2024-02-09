import java.util.stream.IntStream;

public class LambdaStreamExample {
    public static void main(String[] args) {

        long start = System.nanoTime();

        //Even
        System.out.println("Even numbers: ");
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //Odd
        System.out.println("\nOdd numbers: ");
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);

        long end = System.nanoTime();
        long elapsedTime = end - start;

        System.out.println("Execution time for both loops using lambdas/streams: " + elapsedTime + " nanoseconds.");

    }
}

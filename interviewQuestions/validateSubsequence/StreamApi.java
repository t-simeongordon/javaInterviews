import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    public static boolean isValidSubsequence(int[] array, int[] sequence) {
        // Convert the sequence array to a Stream
        Stream<Integer> sequenceStream = IntStream.of(sequence).boxed();

        // Use filter and allMatch to check if all elements in sequence exist in the array
        return sequenceStream
                .allMatch(element -> Arrays.stream(array).anyMatch(num -> num == element));
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        boolean result = isValidSubsequence(array, sequence);
        System.out.println(result); // Output: true
    }
}

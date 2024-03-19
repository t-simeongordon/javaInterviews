package interviewQuestions.validateSubsequence;

public class ForLoop {

    public static boolean isValidSubsequence(int[] array, int[] sequence) {
        int seqIdx = 0;

        // Iterate through the array
        for (int num : array) {
            // Check if current elements match
            if (num == sequence[seqIdx]) {
                seqIdx++; // Move to the next element in the sequence
            }

            // If we've found all elements in the sequence, return true
            if (seqIdx == sequence.length) {
                return true;
            }
        }

        // If we reach the end of the array without finding all elements in the sequence, return false
        return false;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        boolean result = isValidSubsequence(array, sequence);
        System.out.println(result); // Output: true
    }
}

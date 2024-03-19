public class Solution {

    public static boolean isValidSubsequence(int[] array, int[] sequence) {
        int arrIdx = 0;
        int seqIdx = 0;

        // Iterate through the array using a while loop
        while (arrIdx < array.length && seqIdx < sequence.length) {
            // Check if current elements match
            if (array[arrIdx] == sequence[seqIdx]) {
                seqIdx++; // Move to the next element in the sequence
            }
            arrIdx++; // Always move to the next element in the array
        }

        // If we've found all elements in the sequence, return true
        return seqIdx == sequence.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        boolean result = isValidSubsequence(array, sequence);
        System.out.println(result); // Output: true
    }
}

public class MaxSumSubarraySlidingWindow {
    public static int maximumSumSubarraySliding(int k, int[] arr, int n) {
        // Step 1: Calculate sum of first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            // Subtract the element going out, add the element coming in
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = arr.length;

        int result = maximumSumSubarraySliding(k, arr, n);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}


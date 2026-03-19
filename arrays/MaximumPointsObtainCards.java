package arrays;

public class MaximumPointsObtainCards {
     public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Step 1: Calculate total sum
        int totalSum = 0;
        for (int num : cardPoints) {
            totalSum += num;
        }

        // Edge case: if we take all cards
        if (k == n) return totalSum;

        // Step 2: Find minimum subarray sum of size (n - k)
        int windowSize = n - k;
        int windowSum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // Step 3: Slide the window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        // Step 4: Max score = total sum - minimum subarray sum
        return totalSum - minWindowSum;
    }
}

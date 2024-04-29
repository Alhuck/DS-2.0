package alhuck.challenges.mediumlc;

// Greedy Algorithm
public class MaximumSubarray {

    public static int getMaxSubArray(int[] nums) {
        // initialize a variable currentSum as 0
        // initialize a variable currentMax as min value of integer by default
        // loop through the given nums array
        // add each array value to the currentSum variable
        // compare the currentSum and currentMax and update the currentMax to the max
        // value
        // if the currentSum is less than 0, then adding the nums array integer lowers
        // the currentSum so we discard that array and keep currentSum to 0
        // return the currentMax at the end, containing the sum of maximum values of
        // subarray

        int currentSum = 0;
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            currentMax = Math.max(currentSum, currentMax);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {1};
        int[] nums = {5, 4, -1, 7, 8};
        System.out.println(getMaxSubArray(nums));
    }
}

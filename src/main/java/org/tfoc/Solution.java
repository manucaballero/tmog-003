package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static Integer maxSubArrayV1(Integer[] nums) {
        //Brute force solution O(n^2)
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++){

            for(int j = i; j < nums.length; j++){

                currentSum += nums[j];

                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
            currentSum = 0;
        }

        return maxSum;
    }

    public static Integer maxSubArrayV2(Integer[] nums) {
        //Kadanes algorithm O(n)
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;

        for (Integer num : nums) {

            localMax = Math.max(num, num + localMax);
            if (localMax > globalMax) {

                globalMax = localMax;
            }
        }

        return globalMax;
    }

}

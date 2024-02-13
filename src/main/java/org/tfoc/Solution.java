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

}

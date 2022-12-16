import java.util.Arrays;

public class RunningSum {

    /*
        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        Return the running sum of nums.
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        Input: nums = [1,1,1,1,1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRunningSum(new int[]{2, 6, 3, 7, 3})));
    }

    // 1. [2, 6, 3, 7, 3] -> [2, 8, 11, 18, 21]

    public static int[] findRunningSum(int[] array) {
        int[] result = new int[array.length];
        int runningSum = 0;

        for (int i = 0; i < array.length; i++) {
            runningSum += array[i];
            result[i] = runningSum;
        }
        return result;
    }
}

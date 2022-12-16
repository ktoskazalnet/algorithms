public class NumberOfWaysToSplitArr {

    /*
        Example 2: 2270. Number of Ways to Split Array
        Given an integer array nums, find the number of ways to split the array into
        two parts so that the first section has a sum greater than or equal to the sum
        of the second section. The second section should have at least one number.

        array = [1, 2, 3, 4, 5] ->
        1) [1, 2, 3, 4 | 5] -> 1.
        2) [5, 8, 1, 0, 3] -> 3.
        3) [1, 1, 1, 1, 1] -> 2.
     */

    public static void main(String[] args) {
        System.out.println(findWaysToSplitArray(new int[]{1, 1, 1, 1, 1}));
    }

    public static int findWaysToSplitArray(int[] array) {
        int result = 0;
        int firstSectionSum = 0;
        int secondSectionSum = array[array.length - 1];
        int temp;

        if (array.length > 2) {
            temp = array[array.length - 2];
        } else {
            temp = array[array.length - 1];
        }

        for (int i = 0; i < array.length - 1; i++) {
            firstSectionSum += array[i];
        }

        while (firstSectionSum >= secondSectionSum) {
            result++;
            firstSectionSum -= temp;
            secondSectionSum += temp;

            if (array.length > 2) {
                temp = array[array.length - 2 - result];
            } else {
                temp = array[array.length - 1 - result];
            }
        }
        return result;
    }
}

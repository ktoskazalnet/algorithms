
/*
    Учитывая non-empty массив, найти не повторяющееся число.
 */

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        int index = 0;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length + 1; i++) {
                if (nums[index] != nums[i]) {
                    result = nums[index];
                }
                if (i == nums.length - 1) {
                    index = index + 1;
                    i = index + 1;
                }
            }
        }
        return nums[result];

    }
}

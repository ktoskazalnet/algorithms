
public class WaterContainer {

    /*
        You are given an integer array height of length n. There are n vertical lines drawn such
        that the two endpoints of the ith line are (i, 0) and (i, height[i]).

        Find two lines that together with the x-axis form a container,
        such that the container contains the most water.

        Return the maximum amount of water a container can store.

        Notice that you may not slant the container.

        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array
        [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

        Input: height = [1,1]
        Output: 1
     */

    public static void main(String[] args) {
        System.out.println(findMaxCapacity(new int[]{1, 1}));
    }

    public static int findMaxCapacity(int[] array) {
        int axisX = array[0];
        int axisX2 = array[array.length - 1];
        int axisY;
        int temp;
        int area = 0;

        for (int i = 0; i < array.length; i++) {
            if (axisX > axisX2) {
                axisX2 = array[array.length - 1 - i];
            } else {
                axisX = array[i];
            }
            axisY = array.length - 1 - i;
            temp = Math.min(axisX, axisX2) * axisY;

            if (temp > area) {
                area = temp;
            }
        }
        return area;
    }
}

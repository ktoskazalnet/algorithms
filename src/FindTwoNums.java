import java.util.Arrays;

public class FindTwoNums {

    /*
    Нужно написать метод, который на вход принимает массив int и int target.
    Данный метод должен возвращать 2 индекса, сумма элементов которых будет = target.
    index должны вернуться по возрастанию.
     */

    public static void main(String[] args) {
        int[] array = {0, 0};
        int target = 0;

        System.out.println(Arrays.toString(findTwoNums(array, target)));
    }

    // {3, 1, 3, 4, 5} target = 4; -> 1, 2
    // {2, 12, -10, 4} target = -1 -> {0, 0}
    // {3, 3} target = 6, -> 1, 2
    // {2, 2, 2} target = 4 -> 1, 2

//    public static int[] findTwoNums(int[] array, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    result[0] = ++i;
//                    result[1] = ++j;
//                    Arrays.sort(result);
//                    return result;
//                }
//            }
//        }
//        return result;
//    }

    public static int[] findTwoNums(int[] array, int target) {
        int[] result = new int[2];
        int index1 = 0;
        int index2 = 1;

        while(true) {
            if (array[index1] + array[index2] == target) {
                result[0] = ++index1;
                result[1] = ++index2;
            }
            index2++;

            if (index2 == array.length - 1 && index1 != array.length - 2) {
                index1++;
                index2 = index1 + 1;
            } else {
                break;
            }
        }

        Arrays.sort(result);
        return result;
    }
}
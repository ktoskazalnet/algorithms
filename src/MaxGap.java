import java.util.ArrayList;
import java.util.List;

public class MaxGap {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 0, 0, 0, 1, 0};
        System.out.println(findPlace(array));
    }

    public static int findPlace(int[] array) {
        List<Integer> list = new ArrayList<>();
        int gapLength = 0;
        int maxGapLength = Integer.MIN_VALUE;

        list.addAll(calculateSideGapsLength(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                gapLength++;
            } else {
                list.add(gapLength);
                gapLength = 0;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxGapLength) {
                maxGapLength = list.get(i);
            }
        }

        if (maxGapLength % 2 != 0) {
            if (maxGapLength == 1) {
                return 0;
            }
            return maxGapLength / 2 + 1;
        }

        return maxGapLength / 2;
    }

    private static List<Integer> calculateSideGapsLength(int[] array) {
        int sideGapLength = 0;
        List<Integer> gapsLength = new ArrayList<>();

        if (array[0] == 0) {
            for (int i = 0; i < array.length; i++) {
                sideGapLength++;
                if (array[i] == 1) {
                    gapsLength.add(--sideGapLength*2);
                    break;
                }
            }
        }

        if (array[array.length - 1] == 0) {
            sideGapLength = 0;

            for (int i = array.length - 1; i > 0; i--) {
                sideGapLength++;
                if (array[i] == 1) {
                    gapsLength.add(--sideGapLength*2);
                    break;
                }
            }
        }
        return gapsLength;
    }
}

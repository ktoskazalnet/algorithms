import java.util.List;

public class Test {

    /**
     *  Есть список из интов. Подсчитать количество перемен знака в последовательности (ноль не перемена)
     */

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, -3, 10, 0, -5);
        System.out.println(findSignChangeCount(list));
    }

    /*
    1, 2, -3, 10, 0, -5 -> 3
     */

    public static int findSignChangeCount(List<Integer> list) {
        int count = 0;
        int lastNum = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (lastNum > 0 && list.get(i) < 0 || lastNum < 0 && list.get(i) > 0) {
                count++;
            }
            if (list.get(i) != 0) {
                lastNum = list.get(i);
            }
        }

        return count;
    }
}

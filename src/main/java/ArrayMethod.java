import java.util.List;

public class ArrayMethod {

    public int checkIfValuesOnTheSamePositonAreEquals(List<Integer> list, int[] array) {
        int counter = 0;
        int howManyTimes;

        if (list.size() > array.length) {
            howManyTimes = array.length;
        } else {
            howManyTimes = list.size();
        }

        for (int i = 0; i < howManyTimes; i++) {
            if (list.get(i) == array[i]) {
                counter++;
            }
        }

        return counter;
    }
}

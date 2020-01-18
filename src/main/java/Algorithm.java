import java.util.List;
import java.util.stream.Collectors;

public class Algorithm {

    public int findMinPositiveNumberWhichNotExistsInList(List<Integer> list) {
        int result = 1;

        if (list == null || list.isEmpty()) {
            return 1;
        }

        List<Integer> sortedList = list
                .stream()
                .distinct()
                .sorted()
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        for (int numberFromList: sortedList) {
            if (result == numberFromList) {
                result++;
            } else {
                return result;
            }
        }

        return result++;
    }
}

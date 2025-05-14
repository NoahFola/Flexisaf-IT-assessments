import java.util.function.Predicate;
import java.util.*;

public class GenericCounter {

    public static <T> int countFor(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T item : collection) {
            if (predicate.test(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int oddCount = countFor(intList, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddCount);
    }
}
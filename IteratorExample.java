import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "ball", "cat", "dog", "egg"));

        System.out.println("Original list: " + words);

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.contains("a")) {
                iterator.remove(); // Safely remove using iterator
            }
        }

        System.out.println("List after removing words with 'a': " + words);
    }
}

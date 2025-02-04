package utilities;
import java.util.ArrayList;
import java.util.List;
public class StringListSorter {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();

        // Add strings to the list
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Banana");
        strings.add("Grapes");
        strings.add("Pineapple");

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Display the sorted list
        System.out.println("Sorted list in descending order: " + strings);
    }
}

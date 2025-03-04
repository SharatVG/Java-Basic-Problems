import java.util.Arrays;

public class SortCommaSeperatedStringByOrder {

    //Not a big deal.
    public class SortCommaSeparatedStringByOrder {

        public static String sortAndConcatenate(String input) {
            String[] parts = input.split(",");

            // Trim spaces from each part before sorting
            parts = Arrays.stream(parts)
                    .map(String::trim)
                    .toArray(String[]::new);

            Arrays.sort(parts); // Sort alphabetically

            return String.join("", parts); // Concatenated output
        }

        public static void main(String[] args) {
            String input = "banana, apple, cherry, date";
            System.out.println(sortAndConcatenate(input)); // Output: "applebananacherrydate"
        }
    }

}

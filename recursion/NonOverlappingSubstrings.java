import java.util.*;

public class NonOverlappingSubstrings {

    static Set<String> result = new HashSet<>();

    public static void generate(String s, int start, String built) {
        if (start == s.length()) {
            result.add(built.trim());  // add the final built string
            return;
        }

        // From longest to shortest possible substring
        for (int end = s.length(); end > start; end--) {
            String sub = s.substring(start, end);
            String toPrint = built + "{" + sub + "} ";
            generate(s, end, toPrint);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        generate(input, 0, "");

        System.out.println("Non-overlapping substrings:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}

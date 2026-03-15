
import java.util.*;

public class subsets {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));
    }
    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(0, arr, new ArrayList<>(), ans);
        return ans;
    }
    static void generateSubsets(int index, int[] arr, List<Integer> current, List<List<Integer>> ans) {
        // base case
        if (index == arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        // include current element
        current.add(arr[index]);
        generateSubsets(index + 1, arr, current, ans);
        // exclude current element
        current.remove(current.size() - 1);
        generateSubsets(index + 1, arr, current, ans);
    }
    static void generateSubsets(int index, int[] arr, List<Integer> current) {
        // base case
        if (index == arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // include current element
        current.add(arr[index]);
        generateSubsets(index + 1, arr, current);

        // exclude current element
        current.remove(current.size() - 1);
        generateSubsets(index + 1, arr, current);
    }
}


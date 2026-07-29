import java.util.*;

public class Intersection_of_the_array {
    public static List<Integer> intersection(List<Integer> A, int n, List<Integer> B, int m) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (A.get(i) < B.get(j)) {
                i++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                ans.add(A.get(i));
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> List1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 6, 5));
        List<Integer> List2 = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 5, 6));
        List<Integer> result = intersection(List1, List1.size(), List2, List2.size());
        System.out.println("The Intersection of the array is " + result);
    }
}
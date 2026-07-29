import javax.naming.InsufficientResourcesException;
import java.sql.Array;
import java.util.*;

public class union_of_2_array {
    public static List<Integer> union (List < Integer > a, List < Integer > b){
        int n1 = a.size();
        int n2 = b.size();

        Set<Integer> st = new TreeSet<>();
        for (int i = 0; i < n1; i++) {
            st.add(a.get(i));
        }
        for (int i = 0; i < n2; i++) {
            st.add(b.get(i));
        }
        List<Integer> temp = new ArrayList<>();
        for (int it : st) {
            temp.add(it);
        }
        return temp;
    }
    public static void main(String[] args) {
       List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6));
       List<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
       List<Integer> result = union(list1,list2);
        System.out.println("The sorted array is " + result);
    }
}

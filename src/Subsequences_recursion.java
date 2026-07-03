import java.util.ArrayList;

public class Subsequences_recursion {
    public static void subsequenceRec(int ind, int[] arr, ArrayList<Integer> ds,int n){
            if(ind == n){
                for (int it : ds){
                    System.out.println(it + " ");
                }
                if(ds.size() == 0){
                    System.out.println("{}");
                }
                System.out.println();
                return;
            }
            //Take condition
            ds.add(arr[ind]);
            subsequenceRec(ind + 1,arr,ds,n);
            //Not take condition
            ds.remove(ds.size() -1);
            subsequenceRec(ind+1,arr,ds,n);
    }
    public static void main(String[] args){
     int [] arr = {3,1,2};
     ArrayList<Integer> ds = new ArrayList<>();
     int n = 3;
        subsequenceRec(0,arr,ds,n);
     }
}

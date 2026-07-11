import java.util.HashMap;
import java.util.Scanner;

public class Number_Hashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // loop runs till n and we provide the value in array
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        // using of the hashmap
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }

        //fetch
        int q = sc.nextInt();
        while (q-- > 0){
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number,0));
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Bubble_Sort {
    public static void bubble(int[] arr,int  n){
        for(int i = n-1; i >= 0;i--){
            int didSwap = 0;
            for (int j = 0;j <= i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
                if (didSwap == 0){
                    System.out.println("Already in ascending order");
                    break;
            }
            System.out.println("runs");
        }
    }
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = SC.nextInt();
        }
        bubble(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

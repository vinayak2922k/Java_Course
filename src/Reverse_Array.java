import java.util.Scanner;
public class Reverse_Array{

    // Recursive function to reverse the array
    public static void f(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return;
        }
        // Swap elements at index i and n - i - 1
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        // Recursive call
        f(i + 1, arr, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Call the recursive function
            f(0, arr, n);

            // Print the reversed array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}

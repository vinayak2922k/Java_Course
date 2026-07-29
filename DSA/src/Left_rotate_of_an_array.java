import java.util.Scanner;

public static class left_rotate_of_an_array {
    public static int rotate(int[] arr,int n,int d){
        d = d%n;
        int[] temp = new int[d];
        for (int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF VALUES IN THE ARRAY");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER THE VALUE OF D");
        int d = sc.nextInt();
        rotate(arr,n,d);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}


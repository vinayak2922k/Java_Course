public class Var_args {
    static int sum(int x , int ...arr){
        //arr is available as int[] arr;
        int result = x;
        for( int element:arr){
            result +=element;
        }
        return result;
    }

    public static void main() {
        System.out.println("The sum of nothing is: " + sum(0));
        System.out.println("The sum of 2, 3 is: " + sum(2,3));
        System.out.println("The sum of 3,4,5,6 is: " + sum(4,3,4,5,6));
    }
}

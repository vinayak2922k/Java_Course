public class array_question {
    public static void main(String [] args) {


        //1. Sum of 5 float numbers of array;

        /*
        float [] marks = {45.5f,55.5f,65.5f,75.5f,85.5f};
        float sum = 0 ;
        for(float element:marks)
        {
            sum = sum + element;
        }
        System.out.println("The sum of the Array is: " + sum);
        */


        //2.To check whether it is present in array or not

        /*
        float [] marks = {45.5f,55.5f,65.5f,75.5f,85.5f};
        float Checkno = 45.5f;
        boolean Check = false;
        for(float element:marks){
            if (Checkno == element){
                Check = true;
            }
            if(Check == true){
                System.out.println("It is present in the array");
            }
            else{
                System.out.println("Not present in the Array");
            }
        }
         */


        //3. Find the average of the Array/ marks in the Subject

        /*
        float [] marks = {45.5f,55.5f,65.5f,75.5f,85.5f};
        float sum = 0 ;
        for(float element:marks)
        {
            sum = sum + element;
        }
        System.out.println("The sum of the Array is: " + sum/ marks.length);
         */

        //4.Adding 2-D array

        /*
        int[][] mat1 = {{1,2,3},{5,6,7}};
        int[][] mat2 = {{8,9,10},{11,12,13}};
        int[][] result = {{0,0,0},{0,0,0}};
        for(int i = 0 ; i< mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("setting value of i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
            for(int i = 0 ; i< mat1.length;i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        System.out.println("");
        */

        //5.Reverse an array

        //Length/2 = greatest Integer swaps the number like [1,2,3,4,5] = 1 with 5 , 2 with 4 and 3 is mid;
        // change after mid with l-i-1 where i is the value of index
        /*
         int [] arr = {1,2,3,4,5,6};
         int l = arr.length;
         int n = Math.floorDiv(l,2);
         int temp;
         for(int i=0;i<n;i++)
         {
             temp = arr[i];
             arr[i] = arr[l-i-1];
             arr[l-i-1] = temp;
         }
         for (int element:arr){
             System.out.print(element + " ");
         }
         */

        //6.Find the maximum among te array

        /*
        int [] arr = {11,2,366,4,55,6};
        int max = Integer.MIN_VALUE;
                for(int e:arr) {
                    if (e > max) {
                        max = e;
                    }
                }
        System.out.println("The Max value is: " + max);

         */

        //7.Find the minimum Value in the Array

        int [] arr = {11,22,12,56,2,30};
        int min = Integer.MIN_VALUE;
        for(int e:arr){
            if(e>min) {
                e = min;
            }
            }
        System.out.print("The minimum Value of Array is: " + min);
    }
}


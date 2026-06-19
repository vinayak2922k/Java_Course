public class Try_catch {
    public static void main(String args[]){
        int a = 10000 ;
        int b = 0;

        //using of try catch block in the programme ----> Arithmetic Expection
        try{
            int c = a/b;
            System.out.println("The Answer of the code is: " + c);
        }
        catch (Exception e){
            System.out.println("Error occured in the code");
            System.out.println(e);
        }
        System.out.println("End of the programme");
    }
}

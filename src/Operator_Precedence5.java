public class Operator_Precedence5 {
    public static void main(String[] args){
        //predence & associativity
        int a = 6*5-34/2;
        /*
        =30-34/2  predence
        =30-17
        =13
         */
        int b = 30/10-20*2;
        /*
        =3-20*2   associativity left to right
        =3-40
        =-37
        */
        System.out.println(a);
        System.out.println(b);
    }
}

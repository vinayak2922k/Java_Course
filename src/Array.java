public class Array {
   public static void main() {
    int [] marks = new int[5];
    marks[0]= 10;
       marks[1] = 20;
       marks[2] = 30;
       marks[3] = 40;
       marks[4] = 50;
       System.out.println("length of marks Array: " + marks.length);
   //for(int i=0;i<=marks.length;i++) {
     //  System.out.println(marks[i]);
   //};

    // In reverse Order

    //for(int i=marks.length-1; i>=0;i--){
    //    System.out.println("Reverse order of Marks:" + marks[i]);
       //    };
    for(int element:marks){
        System.out.println(element);
    }
   }
}

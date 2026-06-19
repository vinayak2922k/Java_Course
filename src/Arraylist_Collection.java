import java.util.ArrayList;

public class Arraylist_Collection {
    public static void main(String args[]){

        //ArrayList
        ArrayList<Integer> Roll_no = new ArrayList<>(10);
        ArrayList<Integer> marks = new ArrayList<>();

        //marks
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        marks.add(60);
        marks.add(0,20); //To change the value at the particular index
        marks.set(2,69); //Same use to change the value of the particular index

        //roll_no.
        Roll_no.add(1);
        Roll_no.add(2);
        Roll_no.add(3);
        Roll_no.add(4);
        Roll_no.add(5);
        Roll_no.add(6);
        Roll_no.add(7);
        Roll_no.addAll(marks);
        Roll_no.clear();


        System.out.println("The marks in the list is : " + marks.contains(50));
        System.out.println("The index of the Roll Number is : " + Roll_no.indexOf(5));
        System.out.println("The last index of the marks is: " + marks.lastIndexOf(3));

       for(int i = 0; i < Roll_no.size(); i++){
           System.out.println("The Roll no. with marks : " + Roll_no.get(i));
           System.out.print(", ");
       }
    }
}

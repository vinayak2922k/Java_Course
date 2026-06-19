import java.util.LinkedList;

public class LinkedList_Collection {
    public static void main(String args[]){
        LinkedList<Integer> value =  new LinkedList<>();
        LinkedList<Integer> Roll_no = new LinkedList<>();

        value.add(10);
        value.add(20);
        value.add(30);
        value.add(40);
        value.add(50);
        value.add(60);
        value.add(70);
        value.addLast(458);
        value.addFirst(299);
       // value.clear();


        //ROLL NUMBER
        Roll_no.add(1);
        Roll_no.add(2);
        Roll_no.add(3);
        Roll_no.add(4);
        Roll_no.add(5);
        Roll_no.add(6);
        Roll_no.add(7);
        Roll_no.addAll(value);
       // Roll_no.clear();

        System.out.println("The index of the value you want is: " + value.indexOf(30));
        System.out.println("The index of the value you want is: " + value.contains(50));
        System.out.println("The last index of the linked list is: " +  value.lastIndexOf(5));

        for(int i=0; i < Roll_no.size(); i++) {
            System.out.println("The values of the Linked List is: " + Roll_no.get(i));
        }
    }
}

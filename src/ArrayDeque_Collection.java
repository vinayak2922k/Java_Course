import java.util.*;

public class ArrayDeque_Collection {
    public static void main(String[] args){
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        ad1.add(40);
        ad1.add(50);
        ad1.add(60);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.pop());
        System.out.println(ad1.peek());// after pop first element
        for(int i = 0; i < ad1.size(); i++){
            System.out.println("The elements in the Arraydeque is: "+ ad1);
            System.out.print(" , ");
        }
    }
}
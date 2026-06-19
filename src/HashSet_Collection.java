import java.util.*;
public class HashSet_Collection {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(50); //It also eliminates the duplicate value
        System.out.println("The elements in the hashset are: " + hs);
    }
}

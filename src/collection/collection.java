package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection {

    public static void main(String[] args) {

        Collection<Integer> cl = new ArrayList<>();
        // cl -> is the object of Collection Interface. 
        // All the methods of collection is available ( less method)
        // Is flexible. We can change the cl to LinkedList if needed.


        ArrayList<Integer> list = new ArrayList<>();
        // list -> is the object ArrayList Class.
        // All the methods of ArrayList is available ( more method)

        cl.add(0);
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        System.out.println("Collection: "+cl);
        cl.remove(4);
        cl.contains(5); //false
        System.out.println("Collection: "+cl);


        list.addAll(cl);
        System.out.println("List: "+list);
        list.add(0, -1);
        list.contains(-1);

        System.out.println("List: "+list);

        
    }
}
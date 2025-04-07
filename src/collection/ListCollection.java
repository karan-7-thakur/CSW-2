package collection;
import java.util.ArrayList;
import java.util.List;

public class ListCollection {

    public static void main(String[] args) {

        // List -> An Interface implementing collection
        // Ordered : Added indexing
        // has more methods than collection

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0, 0);
        list.add(0, -1);
        // .remove( int ) -> Remove from index
        // .remove( Object/Wrapper class ) -> Remove from object
        // .conatains()
        // .get(index)
        // .set(index, element)
        // .toString()
        // .toArray()
        // .indexOf()
        list.remove(10);

        System.out.println(list);

        // all the methods of ArrayList or LinkedList
        // LinkedList.remove() -> removes the head
        // ArrayList.remove() -> Not avaialable

    }
}
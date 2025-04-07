package collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mapImplementation {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Xiangling");
        map.put(2, "Xingqiu");
        map.put(3, "Amber");
        map.put(4, "Kazuha");
        map.put(5, "Tighnari");
        map.put(6, "Noelle");
        map.put(7, "Jean");
        map.put(8, "Diona");
        map.put(9, "Bennett");
        map.put(10, "Fischl");

        System.out.println(map);

        // For each loop
        for(Map.Entry<Integer, String > entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Iterator

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator(); 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }

        
    }
    
}

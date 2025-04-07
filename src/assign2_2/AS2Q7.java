package assign2_2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    private int plotno;
    private String at;
    private String post;

    public Address(int plotno, String at, String post) {
        this.plotno = plotno;
        this.at = at;
        this.post = post;
    }

    public int getPlotno() {
        return plotno;
    }

    public String getAt() {
        return at;
    }

    public String getPost() {
        return post;
    }

}

public class AS2Q7 {
    public static void main(String[] args) {

        Map<String, Address> list = new TreeMap<>();
        list.put("Sritish", new Address(1, "A", "Pune"));
        list.put("Ram", new Address(10, "B", "Ankuli"));

        Iterator<Map.Entry<String, Address>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getKey() + " " + iterator.next().getValue().getPost());
        }

    }
}

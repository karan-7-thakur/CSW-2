package assign2_2;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

public class AS2Q1 {
    public static void main(String[] args) {

        Pair<Integer, String> map = new Pair(1, "Inazuma");
        System.out.println(map.getKey() + " " + map.getValue());

    }
}

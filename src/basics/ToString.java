package basics;

import java.util.Objects;

public class ToString {

    int id;
    String name;

    public ToString(int id, String name) {
        this.id = id;
    }

    @Override
    public String toString() {

        return "custom toString Methos" + hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        // TypeCasting to comparable object type for value comparison
        ToString other = (ToString) obj;
        return (id == other.id) && (name.equals(other.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {

        // ToString obj1 = new ToString(12);
        // System.out.println(obj1.toString());

        // ToString obj2 = obj1;
        // obj1.id = 100;

        // System.out.println(obj1.id);
        // System.out.println(obj2.id);

        // <object>.equals(obj2) ------------ > compares only the refrence/address

        // System.out.println(obj1.equals(obj2));

        ToString obj1 = new ToString(10, "Hari");
        ToString obj2 = obj1;

        // custom equals that compare both
        System.out.println(obj1.equals(obj2));

        // hashCode
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}

package assign7;

interface StringProcessor{
    public int length(String str);
}

public class q1 {

    static int getLenggth(String str,StringProcessor op){
        return op.length(str);

    }

    public static void main(String[] args) {
        
        int length = getLenggth("Hello", (str)-> {return str.length();});
        System.out.println(length);
        
    }
}

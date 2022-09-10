import java.util.HashSet;
import java.util.Iterator;

public class Hashes {
    public static void main(String[] args) {


        int[] a ={23,4,5,6,7,9};////a simple array
        System.out.println(a[1]);


        //you can't rely on the position of your adding
        HashSet <String> h = new HashSet <>();
        h.add("linux");
        h.add("windows");
        h.add("macos");
        h.add("nokia");
        h.add("halil");
        h.add("halil");

        h.remove("nokia");

        // h.clear(); ///this will remove everything

        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains("macos"));
        System.out.println(h.isEmpty());

        Iterator <String> it = h.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

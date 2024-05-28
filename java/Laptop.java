import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class hello {
    static String name = "sairaj";

    public static void main(String[] args) {

        // Collection<Integer> abc = new ArrayList<Integer>();
        List<String> def = new ArrayList<String>();


        Comparator<String> lengthComparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Collections.sort(def, lengthComparator);

        def.add("Sairaj");
        def.add("Amit");
        def.add("Hrutvik");
        def.add("Omkar");
        def.add("Om");
 
        Collections.sort(def, lengthComparator);


        System.out.println(def);

    }
}

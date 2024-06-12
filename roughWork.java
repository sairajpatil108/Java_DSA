import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.HashSet;
import java.util.*;

public class roughWork {

    public static void main(String[] args) {
    int x = 123456;
    

    // List diclaration
   List<Integer> a = new ArrayList<>(); 
   List<String> b = new Vector<String>();
   Set<Integer> c = new HashSet<Integer>();
 
   

    while (x!=0) {
        System.out.println(x%10);
        x = x/10;
    }
   
    }
}

// List<Integer> y = new LinkedList<Integer>();

// while (x!=0) {
// y.add(x%10);
// x = x/10;
// }

// for (int i = 0; i < y.size(); i++) {
// System.out.println(y.get(i));
// }
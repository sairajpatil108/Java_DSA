import java.util.HashMap;
// import java.util.Map;

public class hashing {
    public static void main(String[] args) {

        HashMap<String, Integer> m = new HashMap<String, Integer>();
        HashMap<String, Integer> n = new HashMap<String, Integer>(m);

        m.put("sairaj", 1);
        m.put("patil", 2);
        m.put("PCCOE", 3);

        
        // Methods---

        // System.out.println(m.get("sairaj"));
        // System.out.println(m);
        // m.clear();

        System.out.println(m.entrySet());
           
        // System.out.println(m);
        // System.out.println(m.values());
    }
}

// int[] arr = { 1, 2, 2, 4, 5, 6, 6, 8, 9 };
// int n = arr.length;
// int[] hash = new int[10];

// for (int i = 0 ; i < n ; i++){
// hash[arr[i]] = arr[i];
// }

// for (int i = 0; i < hash.length; i++) {
// System.out.println(hash[i]);
// }

// public static void main(String[] args) {
// int hash[] = new int[26];
// String s = "sairaj";
// char arr[] = s.toCharArray();
// System.out.println(arr[1]);

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] >= 'a' && arr[i] <= 'z') {
// hash[arr[i] - 'a']++;
// }
// }

// for (int i = 0; i < hash.length; i++) {
// System.out.println((char) (i + 'a') + ": " + hash[i]);
// }
// }

// int hash[] = new int[26];
// String s = "sairaj";
// char arr[] = s.toCharArray();
// System.out.println(arr[1]);

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] >= 'a' && arr[i] <= 'z') {
// hash[arr[i] - 'a']++;
// }
// }

// for (int i = 0; i < hash.length; i++) {
// System.out.println((char) (i + 'a') + ": " + hash[i]);
// }
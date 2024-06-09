public class roughWork {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5, 7 };
        int hash[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            System.out.println(hash[i]);
        }
    }
}

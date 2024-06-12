public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {21,3,45,36,5,23,18,23};

        for (int j = arr.length - 1 ; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i]>arr[i+1]) {
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

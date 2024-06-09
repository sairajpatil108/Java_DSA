public class selectionSort {

    public static void main(String[] args) {

        int arr[] = { 10, 3, 24, 25, 8, 39, 16, 60 };

        for (int i = 0; i < arr.length - 1; i++) {

            int min = arr[i];

            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < min) {
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
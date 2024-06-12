public class selectionSort {

    public static void main(String[] args) {

        int arr[] = { 1, 20, 34, 54, 12, 21 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// for (int i = 0; i < arr.length - 1; i++) {

// int min = arr[i];

// for (int j = i; j < arr.length - 1; j++) {
// if (arr[j] < min) {
// int temp = min;
// min = arr[j];
// arr[j] = temp;
// }
// }
// }

// for (int i : arr) {
// System.out.println(i);
// }
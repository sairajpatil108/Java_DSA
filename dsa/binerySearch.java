
class binerySearch {

    public static int binaary_search(int arr[], int k) {

        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            }

        }
  return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 5;
        System.out.println(binaary_search(arr, k));
    }
}

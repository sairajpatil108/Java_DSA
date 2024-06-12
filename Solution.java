
import java.util.Arrays;


class Solution {

    public static void sortColors(int[] nums) {
     
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 2, 0, 0};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}



// for (var i = 0; i < nums.length; i++) {
//     int max = nums[i];
//     for (var j = i; j < nums.length; j++) {
//         if (nums[j] < max) {
//             max = nums[j];
//             nums[j] = nums[i];
//             nums[i] = max;
//         }
//     }
// }


// import java.util.HashSet;
// import java.util.Set;
// class Solution {
// public boolean isHappy(int n) {
// Set<Integer> seen = new HashSet<>();
// while (n != 1 && !seen.contains(n)) {
// seen.add(n);
// n = getNext(n);
// }
// return n == 1;
// }
// private int getNext(int number) {
// int sum = 0;
// while (number > 0) {
// int digit = number % 10;
// sum += digit * digit;
// number /= 10;
// }
// return sum;
// }}
// public static void rotate(int[] nums, int k) {
// int temp = nums[0];
// for (int i = 0; i < nums.length - 1; i++) {
// nums[i] = nums[i + 1];
// }
// nums[nums.length - 1] = temp;
// for (int i = 0; i < nums.length; i++) {
// System.out.println(nums[i]);
// }
// }
// public static void rotate(int[] nums, int k) {
//     int n = nums.length;
//     k = k % n; // Ensure k is within the bounds of the array length
//     // Create a temporary array to store the result
//     int[] temp = new int[n];
//     // Copy the last k elements to the beginning of the temp array
//     for (int i = 0; i < k; i++) {
//         temp[i] = nums[n - k + i];
//     }
//     // Copy the first n - k elements to the end of the temp array
//     for (int i = k; i < n; i++) {
//         temp[i] = nums[i - k];
//     }
//     // Copy the temp array back to the original array
//     for (int i = 0; i < n; i++) {
//         nums[i] = temp[i];
//     }
//     // Print the rotated array
//     for (int i = 0; i < nums.length; i++) {
//         System.out.print(nums[i] + " ");
//     }
// }
// public static void main(String[] args) {
//     int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//     rotate(arr, 4);
// }




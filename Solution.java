import java.util.*;
class Solution {
    public static int missingNumber(int[] nums) {

      int ret = 0;

      Arrays.sort(nums);

      for (var i = 0; i < nums.length; i++) {
       System.out.println(nums[i]);          
      }
        for (var i = 1; i < nums.length-1; i++) {
        if(nums[i]!=nums[i+1]+1){
           ret = nums[i]+1;
        }  
      }
      return ret;
    }
    
    public static void main(String args[]){
      System.out.println("hello");
      int arr[] = {2,3,1,5,6,7,8,9};
      
      System.out.println("missing "+missingNumber(arr));
    }

}


// class Solution {

//     public static void moveZeroes(int[] nums) {
//         int i = 0, j = 0, k = 0;

//         while (i < nums.length) {
//             if (nums[i] == 0) {
//                 j++;
//             } else {
//                 nums[k++] = nums[i];
//             }
//             i++;
//         }

//         while (j > 0) {
//             nums[k++] = 0;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 0, 5, 0, 0, 1, 9, 0};
//         moveZeroes(arr);
//         for (var i = 0; i < arr.length; i++) {
//               System.out.println(arr[i]);            
//         }
//     }
// }

// class Solution {
//     public static void moveZeroes(int[] nums) {
//         for (var j = 0; j < nums.length/2; j++) {
//             for (var i = 0; i < nums.length-1; i++) {
//                 if (nums[i] == 0 ) {
//                     int temp = nums[i];
//                     nums[i] = nums[i + 1];
//                     nums[i + 1] = temp;
//                 }
//             }            
//         }
//         for (var i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]);
//         }
//     }
//     // public static void main(String[] args) {
//     //     int arr[] = {1, 2, 0, 5, 0, 0, 1, 9, 0};
//     //     moveZeroes(arr);
//     // }
// }
// class Solution {
//     public static void sortColors(int[] nums) {
//         Arrays.sort(nums);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 1, 1, 2, 0, 0};
//         sortColors(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
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



class Solution {
    public int passThePillow(int n, int time) {
        int count = time % n;
        int ans = 0;

        while(count!=0){
          ans++;
          count--;
        }
        return ans;
    }
}


// //  Definition for singly-linked list.
//   class ListNode {
//       int val;
//       ListNode next;
//       ListNode(int x) {
//           val = x;
//           next = null;
//       }
//  }


// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode temp = head;
//         int dummy = -876879546;

//         while (temp != null) {
//             if (temp.val == dummy) {
//                 return temp;
//             } else {
//                 temp.val = dummy;
//                 temp = temp.next;
//             }
//         }
//         return null;
//     }
// }




//  // Definition for singly-linked list.
// class ListNode {
//       int val;
//       ListNode next;
//       ListNode(int x) {
//           val = x;
//           next = null;
//      }
//   }
 
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         boolean ans = false;
//         int dummy = -876879546;
//         ListNode temp = head;
//         while(temp !=  null){
//             if (temp.val == dummy){
//                 ans = true;
//                 break;
//             } else
//             {
//                 temp.val = dummy;
//                 temp = temp.next;
//             }
//         }
//         return ans;
//     }
// }



// import java.util.*;
// //   Definition for singly-linked list.

// class ListNode {

//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

// class Solution {

//     public ListNode reverseList(ListNode head) {
//         Stack<Integer> MyStack = new Stack();
//         ListNode temp = head;

//         while (temp.next != null) {
//             MyStack.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;

//         while (temp.next != null) {
//             temp.val = MyStack.pop();
//             temp = temp.next;
//         }
        
//         return temp;

//     }
// }

// //   Definition for singly-linked list.
//    class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp = head;
//         int length =0;
//         while(temp.next!=null){
//             length++;
//             temp = temp.next;
//         }
//         int mid = (length + 1)/2;
//         for (int i = 0; i < mid; i++) {
//             head = head.next;
//         }
//  return head;
//     }
// }
// //  Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {
//     }
//     ListNode(int val) {
//         this.val = val;
//     }
//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }
// class Solution {
//     public ListNode mergeNodes(ListNode head) {
//         ListNode newHead = new ListNode();
//         ListNode temp1 = newHead;
//         ListNode temp2 = head;
//         while (head.next.val != 0) {
//             int sum = 0;
//             while (temp2.next.val != 0) {
//                 sum = sum + temp2.val;
//             }
//             temp1.val = sum;
//             temp1 = temp1.next;
//             head = head.next;
//         }
//         return temp1;
//     }
// }
// import java.util.Arrays;
// class Solution {
//     public int minDifference(int[] nums) {
//         if (nums.length <= 4) {
//             return 0;
//         }
//         int count = 3;
//         Arrays.sort(nums);
//         return 0;
//     }
// }
// import java.util.*;
// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> resultList = new ArrayList<>();
//         // Sort both arrays
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int i = 0, j = 0;
//         // Use two pointers to find the intersection
//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] == nums2[j]) {
//                 resultList.add(nums1[i]);
//                 i++;
//                 j++;
//             } else if (nums1[i] < nums2[j]) {
//                 i++;
//             } else {
//                 j++;
//             }
//         }
//         // Convert resultList to an array
//         int[] result = new int[resultList.size()];
//         for (int k = 0; k < result.length; k++) {
//             result[k] = resultList.get(k);
//         }
//         return result;
//     }
// }
// class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//         boolean ans = false;
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 != 0) {
//                 count++;
//                 if (count >= 3) {
//                     ans = true;
//                 }
//             } else {
//                 count = 0;
//             }
//         }
//         return ans;
//     }
// }
// class Solution {
//     public int mySqrt(int x) {
//      int start = 0;
//      int end = x;
//      while (end>start) { 
//             int mid = start + end;
//             if (mid*mid == x || x%mid<mid ) {
//                return mid; 
//             }
//             if (mid*mid>x) {
//                 end = mid;
//             }
//             if (mid*mid<x) {
//                 start = mid;
//             }
//      }
//      return -1;      
//     }
// }
// class Solution {
//     public static int missingNumber(int[] nums) {
//         int n = nums.length;
//         boolean[] hash = new boolean[n + 1]; // Accommodate all numbers from 0 to n
//         // Mark present numbers
//         for (int num : nums) {
//             hash[num] = true;
//         }
//         // Find the missing number
//         for (int i = 0; i <= n; i++) {
//             if (!hash[i]) {
//                 return i;
//             }
//         }
//         return 0; // This line will never be reached
//     }
//     public static void main(String[] args) {
//         int arr[] = {0,1,2,4,5,6,7,8,9};
//         System.out.println(missingNumber(arr));
//     }
// }
// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] % 2 == 0) {
//                 nums[i] = 0;
//             } else {
//                 nums[i] = 1;
//             }
//         }
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//              for (int j = i; j < nums.length; j++) {
//                  sum = sum + nums[j];
//              }
//              if(sum==k){
//                 count++;
//              }
//         }
//         return count;
//     }
// }
// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 for (int K = i; K < j; K++) {
//                     sum = sum + nums[K];
//                 }
//                 if (sum == goal) {
//                     count ++;
//                 }
//             }
//         }
//         return count;
//     }
// }
// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//         int sol = 0;
//         for (int i = 0; i < minutes; i++) {
//             sol = sol + (customers[i]*grumpy[i]);
//         }
//         return sol;
//     }
// }
// class Solution {
//     public static int[] rearrangeArray(int[] nums) {
//         int pos[] = new int[nums.length / 2];
//         int neg[] = new int[nums.length / 2];
//         int a = 0;
//         int b = 0;
//         int c = 0;
//         int d = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 pos[a] = nums[i];
//                 a++;
//             } else if (nums[i] < 0) {
//                 neg[b] = nums[i];
//                 b++;
//             }
//         }
//         for (int i = 0; i < nums.length; i++) {
//             if (i % 2 == 0) {
//                 nums[i] = pos[c];
//                 c++;
//             } else {
//                 nums[i] = neg[d];
//                 d++;
//             }
//         }
//         return nums;
//     }
//     public static void main(String[] args) {
//         int pr[] = {1, -12, -4, 5, 23, -4, -16, 1};
//         rearrangeArray(pr);
//     }
// }
// for (int i = 0; i < prices.length; i++) {
//     for (int j = i + 1; j < prices.length; j++) {
//         if (max < (prices[j] - prices[i])) {
//             max = (prices[j] - prices[i]);
//         }
//     }
// }
// class Solution {
//     public static int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             }
//             if (nums[mid] > target) {
//                 right = mid;
//             }
//             if (nums[mid] <= target) {
//                 left = mid;
//             } 
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int s = 10;
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
//         System.out.println(search(arr, s));
//     }
// }
// class Solution {
//     public int search(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length;
//         if (target > nums[nums.length/2]) {
//         }
//     }
// }
// class Solution {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i; j < prices.length; j++) {
//                 if ((prices[j]-prices[i])> max) {
//                     max = prices[j]-prices[i];
//                 }
//             }
//         }
//        return max;
//     }
// }
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 if (sum1(nums, i, j) > max) {
//                     max = sum1(nums, i, j);
//                 }
//             }
//         }
//         return max;
//     }
//     public int sum1(int arr[], int s, int e) {
//         int sumx = 0;
//         for (int i = s; i < e; i++) {
//             sumx = sumx + arr[i];
//         }
//         return sumx;
//     }
// }
// class Solution {
//     public static int lenOfdoubleSubarr(int A[], int N, int K) {
//         int max = 0;
//         for (int idx = 0; idx < A.length; idx++) {
//             for (int idxb = idx; idxb < A.length; idxb++) {
//                 if (sum(A , idx, idxb) == K) {
//                     if (idxb - idx > max) {
//                         max = idxb - idx;
//                     }
//                 }
//             }
//         }
//         return max;
//     }
//     public static int sum(int arr[] , int i, int j) {
//         int sum = 0;
//         for (int idx = i; idx < j; idx++) {
//             sum = sum + arr[idx];
//         }
//         return sum;
//     }
// }
// class Solution {
//     public boolean judgeSquareSum(int c) {
//         boolean s = false;
//         if (c == 1 || c == 0) {
//             s = true;
//         }
//        double start = 0;
//        double end = Math.sqrt(c);
//        for (double i = start; i < end ; i++) {
//           for (double j = start; j < end; j++) {
//             if ((i*i)+(j*j) < c) {
//                 start = (i*i)+(j*j);
//                 break;
//             }
//             if ((i*i)+(j*j) < c) {
//                 end = (i*i)+(j*j);
//                 break;
//             }
//             if ((i*i)+(j*j) == c) {
//                 s = true;  
//             }
//           }
//        }
//         return s;
//     }
// }
// import java.util.*;
// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans = 0;
//         for (var i = 0; i < nums.length; i++) {
//             if (i == nums.length - 1) {
//                 ans = nums[i];
//                 break;
//             }
//             if (nums[i] != nums[i + 1]) {
//                 ans = nums[i];
//                 break;
//             }
//             i++;
//         }
//         return ans;
// }
// class Solution {
//   public int findMaxConsecutiveOnes(int[] nums) {
//     int max = 0;
//     int count =0;
//    for (var i = 0; i < nums.length; i++) {
//       if (nums[i]==1) {
//           count++;
//           if (count>max) {
//               max = count;
//           }
//       }else if(nums[i]!=1){
//           count = 0;
//       }
//    }
//     return  max;
//   }
// }
// import java.util.*;
// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         int count = 0;
//         Arrays.sort(nums);
//         for (var i = 1; i < nums.length - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 nums[i + 1]++;
//                 count++;
//             }
//         }
//         return count;
//     }
// }
// import java.util.*;
// class Solution {
//     //Function to return a list containing the union of the two arrays.
//     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
//         ArrayList<Integer> list = new ArrayList<>();
//         Set<Integer> s = new HashSet<>();
//         for (var i = 0; i < arr1.length; i++) {
//             s.add(arr1[i]);
//         }
//         for (var i = 0; i < arr2.length; i++) {
//             s.add(arr2[i]);
//         }
//         s.toArray();
//         for (var i = 0; i < s.size(); i++) {
//             list.add((int) s.toArray()[i]);
//         }
//         return list;
//     }
// }
// import java.util.*;
// class Solution {
//     public static int missingNumber(int[] nums) {
//       int ret = 0;
//       Arrays.sort(nums);
//       for (var i = 0; i < nums.length; i++) {
//        System.out.println(nums[i]);          
//       }
//         for (var i = 1; i < nums.length-1; i++) {
//         if(nums[i]!=nums[i+1]+1){
//            ret = nums[i]+1;
//         }  
//       }
//       return ret;
//     }
//     public static void main(String args[]){
//       System.out.println("hello");
//       int arr[] = {2,3,1,5,6,7,8,9};
//       System.out.println(".()");
//       System.out.println("missing "+missingNumber(arr));
//     }
// }
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


import java.util.Set;

public class array {

    public static boolean isSorted(int nums[]) {
        boolean flag = true;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i]>nums[i+1]) {
                flag = false;
            }
        }
         return flag;
    }

    public static void main(String[] args) {
        int nums[] = { 10, 20, 20, 30, 40, 50 };

        Set<Integer> st = new Set<Integer>();

        System.out.println(isSorted(nums));
    }
}

// public static void main(String[] args) {
// int nums[] = {10,20,30,40,50,20,60,90,30};
// int max = nums[1];

// for (int i = 0; i < nums.length; i++) {
// if (max<nums[i]) {
// max = nums[i];
// }
// }
// System.out.println(max);
// }

// int secondLargest(int nums[]) {
// int max = 0;
// int secLarge = nums[1];
// for (int i = 0; i < nums.length; i++) {
// if (max < nums[i]) {
// max = nums[i];
// }
// }

// for (int i = 0; i < nums.length; i++) {
// if (nums[1] < nums[i] && nums[i]!=max) {
// nums[1] = nums[i];
// }
// }
// System.out.println("second largest :" + nums[1]);
// return 0;
// }
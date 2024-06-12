public class array {

    public static void main(String[] args) {
      
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

// public static boolean isSorted(int nums[]) {
// boolean flag = true;
// for (int i = 0; i < nums.length -1; i++) {
// if (nums[i]>nums[i+1]) {
// flag = false;
// }
// }
// return flag;
// }

// public static void main(String[] args) {
// int nums[] = { 10, 20, 20, 30, 40, 50 };

// Set<Integer> st = new Set<Integer>();

// System.out.println(isSorted(nums));
// }

// int nums[] = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 7 };
// Set<Integer> c = new HashSet<Integer>();
// for (int i = 0; i < nums.length; i++) {
// c.add(nums[i]);
// }
// c.toArray();
// int size = c.size();
// System.out.println(c.size());


// int nums[] = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 7 };

// int x = 0;

// for (int i = 0; i < nums.length -1; i++) {
//     if (nums[i] != nums[i + 1]) {
//         nums[x] = nums[i];
//         x++;
//     }
// }

// nums[x] = nums[nums.length - 1];
// x++;

// for (int i = 0; i < x; i++) {
//     System.out.println(nums[i]);
// }


class Recursion {
    
    public static void main(String[] args) {
    }
}

// public static void print(int N, String name) {
// if (N > 0) {
// print(N - 1, name);
// } else {
// return;
// }
// System.out.println(name);

// }

// public static void print(int i , int n) {
// if (i<=n) {
// print(i+1, n);
// System.out.print(i);
// }
// else {
// return;
// }
// }

// static int sum = 0;
// public static void rec(int N) {
// if (N > 0) {
// N--;
// rec(N);
// sum = sum + N;
// } else {
// return;
// }
// }

// public static int factorial(int a){
// if (a > 0) {
// return a * factorial(a - 1);
// } else {
// return 1;
// }
// }



// public static void reverse(int[] arr, int start, int end) {
//     if (start >= end) {
//         return; // Base case: when start index is greater than or equal to end index
//     }
    
//     // Swap elements
//     int temp = arr[start];
//     arr[start] = arr[end];
//     arr[end] = temp;
    
//     // Recursive call
//     reverse(arr, start + 1, end - 1);
// }


// public static int factorial(int a) {
//     if(a > 0 ){
//         return a + factorial(a-1);
//     }
//     else{
//         return 0;
//     }
// }


// public static void printName(int a) {
//     if (a>0) {
//         printName(a-1);
//     }else{
//         return;
//     }
//     System.out.println("Sairaj");
// }


// public static void oneToN(int a) {
//     if (a>0) {
//         oneToN(a-1);
//         System.out.println(a);
//     }else{
//         return;
//     }
// }


// static int sum;
// public static int sumOfN(int n) {
//   if (n>0) {
//       sumOfN(n-1);
//       sum = sum + n;  
//       return sum;  
//   }else{
//       return 0;
//   }
   
// }



// static int ans=1;
// public static int factorial(int n) {
//  if (n>0) {
//      factorial(n-1);
//      ans = ans*n;
//      return ans;
//  }
//  else{
//      return 1;
//  }
// }


// public static boolean isPowerOfTwo(int n) {
//     // Base cases
//     if (n == 1) {
//         return true;
//     }
//     if (n <= 0) {
//         return false;
//     }
//     // Recursive case
//     if (n % 2 == 0) {
//         return isPowerOfTwo(n / 2);
//     } else {
//         return false;
//     }
// }
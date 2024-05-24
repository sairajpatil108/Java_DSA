public class numbers {

    public static void main(String[] args) {
        int a = 1234567890;
        int temp = a;
        int count = 0;
        int rem;
        int rev = 0;

        while (temp != 0) {
            rem = temp % 10; // Get the last digit of temp
            temp = temp / 10; // Remove the last digit of temp
            count++;
            rev = rev * 10 + rem;
        }
        System.out.println("size: " + count);
        System.out.println("Reversed: " + rev);

        if (a == rev) {
            System.out.println("it is palendrome");
        } else {
            System.out.println("it is not palendrome");
        }

    }

}

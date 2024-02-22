import java.util.Scanner;

public class problem4 {
    public static double findMedian(double[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1.0; // Array is empty, return -1.0
        }
        if (n % 2 == 0) {
            int midIndex1 = n / 2 - 1;
            int midIndex2 = n / 2;
            return Math.round(((nums[midIndex1] + nums[midIndex2]) / 2.0) * 10.0) / 10.0;
        } else {
            int midIndex = n / 2;
            return Math.round(nums[midIndex] * 10.0) / 10.0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        double[] nums = new double[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextDouble();
        }

        double median = findMedian(nums);
        System.out.println("Median of the array: " + median);

        scanner.close();
    }


}

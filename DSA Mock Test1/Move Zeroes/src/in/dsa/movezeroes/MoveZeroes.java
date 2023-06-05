package in.dsa.movezeroes;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < n) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.print("Input: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        moveZeroes(nums);

        System.out.print("\nOutput: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
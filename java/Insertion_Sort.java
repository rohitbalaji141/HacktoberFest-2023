public class InsertionSort {
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) { // Start from the second element
            int key = nums[i];
            int j = i - 1;

            // Move elements of nums[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key; // Place the key in its correct position
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = sorter.sortArray(nums);

        // Print sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}

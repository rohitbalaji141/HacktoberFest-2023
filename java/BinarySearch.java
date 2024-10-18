public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sorted array

        int low = 0, high = arr.length - 1;
        int num = 6; // Number to search for
        boolean found = false; // Flag to indicate if the number is found

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == num) {
                System.out.println("Number found at index: " + mid);
                found = true; // Set flag to true
                break;
            } else if (arr[mid] < num) {
                low = mid + 1; // Move to the right half
            } else {
                high = mid - 1; // Move to the left half
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}

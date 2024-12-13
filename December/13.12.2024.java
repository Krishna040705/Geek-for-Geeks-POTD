class Solution {
    public int findMin(int[] arr) {
        int start = 0, end = arr.length - 1; // Initialize start and end pointers
        // Binary search loop
        while (start < end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            if (arr[mid] > arr[end]) {
                // If middle element is greater than the last element, minimum is to the right
                start = mid + 1;
            } else {
                // If middle element is smaller than the last element, minimum is to the left (including mid)
                end = mid;
            }
        }
        return arr[start]; // When start == end, we have found the minimum element
    }
}

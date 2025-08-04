import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Two pointers: end of initialized part of nums1, start of nums2
        int left = m - 1;
        int right = 0;

        // Swap out-of-order elements between nums1[0..m-1] and nums2[0..n-1]
        while (left >= 0 && right < n && nums1[left] > nums2[right]) {
            int temp = nums1[left];
            nums1[left] = nums2[right];
            nums2[right] = temp;
            left--;
            right++;
        }

        // Sort the two partitions individually
        Arrays.sort(nums1, 0, m); // only the first m elements are meaningful initially
        Arrays.sort(nums2);       // entire nums2

        // Copy the sorted nums2 into the tail of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}

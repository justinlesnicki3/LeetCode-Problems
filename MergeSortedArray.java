class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = (n + m);

        int[] array = new int[length];

        for (int i = 0; i < m; i++) {
            array[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            array[i + m] = nums2[i];
        }

        for (int i = 0; i < length; i++) {
            nums1[i] = array[i];
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}


class Solution {

    public int BS(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public void search(int[] nums, int target) {
        int k = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                k = i + 1;
                break;
            }
        }
        int a = BS(nums, 0, k - 1, target);
        int b = BS(nums, k, nums.length - 1, target);

        if (a < 0 && b < 0) {
            System.out.println("Not found");
        }
        if (a >= 0 && b < 0) {
            System.out.println(a);
        } else {
            System.out.println(b);

        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        s.search(nums, target);
    }
}

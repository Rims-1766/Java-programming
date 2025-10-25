class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = search(nums, target, true);   // find first position
        ans[1] = search(nums, target, false);  // find last position
        return ans;
    }

    private int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid; // potential answer found
                if (findStartIndex) {
                    end = mid - 1;  // keep searching left side
                } else {
                    start = mid + 1; // keep searching right side
                }
            }
        }
        return ans;
    }
}

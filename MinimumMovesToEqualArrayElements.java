package Arrays;

public class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
    int[] nums={4,7,8};
        System.out.println(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i] - min;
        }
        return ans;
    }
}

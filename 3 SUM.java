import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac1{// As told by striver.Best Approach.
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            int sum = nums[i] + nums[k] + nums[j];
            if (sum < 0) {
                j++;
            } else if (sum > 0) {
                k--;
            } else {
                List<Integer> ans1 = Arrays.asList(nums[i], nums[j], nums[k]);
                ans.add(ans1);
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) j++;
                while (j < k && nums[k] == nums[k + 1]) k--;
            }
        }
    }
    return ans;
}
}
package TwoSum;

import java.util.Arrays;

/**
 * Created by guoxiaopeng on 2017/8/28.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] dNums  = Arrays.stream(nums).map(n -> target-n).toArray();
        int [] answer = new int[2];
        for (int i = 0; i < dNums.length;i++)
            for (int j = 0; j < nums.length;j++)
                if (nums[j] == dNums[i] && i != j) {
                    answer[0] = i;
                    answer[1] = j;
                }
        return answer;
    }

    public static void main(String args[]) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums,target)[1]);
    }

}

package program_179;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
        }

        return getMaxNum(numList);
    }

    private String getMaxNum(List<Integer> nums) {
        if (Integer.valueOf(0).equals(nums.size())) {
            return "";
        }

        List<String> sumList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> temp = new ArrayList<>(nums);
            temp.remove(i);
            sumList.add(nums.get(i) + getMaxNum(temp));
        }

        String a = "0";
        Integer maxIndex = 0;
        for (int i = 0; i < sumList.size(); i++) {
            if (a.compareTo(sumList.get(i)) < 0) {
                a = sumList.get(i);
                maxIndex = i;
            }
        }

        nums.remove(maxIndex);
        return nums.get(maxIndex) + getMaxNum(nums);
    }
}

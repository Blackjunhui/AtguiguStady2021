import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zjh
 * @Date: 2021/7/19 17:15
 * @Version 1.0
 * 两数之和：
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 */
public class TwoSumDemo {

    //暴力解法--->遍历：时间复杂度太高
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if(target - nums[i] == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //解法优化--->hash：空间复杂度提升
    public static int[] twoSumHash(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int p = target - nums[i];
//            if(p == nums[i]){
//                return new int[]{i,i};
//            }
            if(map.containsKey(p)){
                return new int[]{map.get(p),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 4;

        int[] ints = twoSumHash(nums, target);

        for(int i: ints){
            System.out.println(i);
        }
    }

}

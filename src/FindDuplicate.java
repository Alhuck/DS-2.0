import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.IntStream;

public class FindDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        // *****Approach 1: with HashMap******
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (hm.get(nums[i]) == null) {
//                hm.put(nums[i], 1);
//            } else {
//                hm.put(nums[i], hm.get(nums[i]) + 1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
//            if (m.getValue() > 1) {
//                return true;
//            }
//            ;
//        }
//        return false;

        // *****Approach two: With Hashset******
//        var hs = new HashSet();
//        for (int i = 0; i < nums.length; i++) {
//            if(!hs.add(nums[i])) {
//                return true;
//            };
//        }
//        return false;

        // Approach 3: with inbuilt apis
        return IntStream.of(nums).distinct().count() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
}

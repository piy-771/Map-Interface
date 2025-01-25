import java.util.Arrays;
import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] nums = {1,2,3,1,1,3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0;i< nums.length;i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0) + 1);
        }
        int count = 0;
//        for(int i = 0;i<hashMap.size();i++){
//
//        }
        for(int i : hashMap.values()){
            count += (i*(i-1))/2;
        }
        System.out.println(count);
        System.out.println(hashMap.values());
        System.out.println(hashMap);

    }
}

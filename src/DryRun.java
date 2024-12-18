import java.util.Arrays;
import java.util.HashMap;

public class DryRun {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6,12,  8,4,4};
        int x = 8;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
           int n,k;
           n = nums[i];
           k = x-n;
           if(map.containsKey(k) ){
               System.out.println(map.get(k) + "," + i);
           }
           map.put(n,i);
        }

       // System.out.println(map);
    }
}

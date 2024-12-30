import java.util.Map;
import java.util.TreeMap;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};
        Map<Integer,Integer> map1 = new TreeMap<>();
        Map<Integer,Integer> map2 = new TreeMap<>();
        for(int i = 0;i<a.length;i++){
            if(map1.containsKey(a[i])){
               int k = map1.get(a[i]);
                map1.replace(a[i],map1.get(i));
            }else{
                map1.put(a[i],0);
            }

        }
        System.out.println(map1);


        //write a program to return maximum sum of given window size.

    }
}

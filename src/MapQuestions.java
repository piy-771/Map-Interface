import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapQuestions {
    public static void main(String[] args) {
        int initialValue = 0;
        int[] a = {1,5,1,5,2,7,8};
        Map map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            if(i==a[i]){
                map.put(i,i++);
            }
        }
//        map.put(0,5);
//        map.put(12,58);
//        map.put(1,89);
//        map.put(2,20);
//        map.put(3,56);
//        map.put(3,45);
//        map.put(45,"Samay");
//        System.out.println(map);
//        System.out.println(map.keySet());
//        map.clear();
//        System.out.println(map);
//        for (int i = 0; i < a.length; i++) {
//            if(map.containsKey(a[i])){
//                map.put(a[i],initialValue++);
//            }
//            map.put(a[i],initialValue);
//        }
        System.out.println(map);

    }
}

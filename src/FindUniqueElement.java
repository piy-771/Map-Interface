import java.util.HashMap;

public class FindUniqueElement {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {6, 2, 5, 2, 2, 6, 6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);


        for(int i: map.keySet()){
            System.out.println(i);
            if(map.get(i)<k){
                System.out.println(i);
            }

        }

    }
}

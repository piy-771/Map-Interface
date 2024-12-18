import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Piyush",58);
        hashMap.put("Anurag",52);
        hashMap.put("Lion",89);
        System.out.println(hashMap.get("Piyush"));

        System.out.println(hashMap);
        System.out.println(hashMap.get("Anurag"));
    }
}

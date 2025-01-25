import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("Hello","First Record");
        map.put("Java",true);
        map.put("ion",12.02);
        map.put("Python","First dup");
        System.out.println((map.get("ion")));
        System.out.println(map.get("Java"));



        Set set1= map.keySet();
        System.out.println("Keys = " + set1);

        Collection collection = map.values();
        System.out.println("Values = " + collection);

        Set set2 =  map.entrySet();
        System.out.println("Map = " + set2);

        System.out.println("Size of map = " + map.size());

        if(map.containsKey("Java")){
            map.remove("Java");
        }
        System.out.println("Map after removing certain key = " + map);

        if(map.containsValue(true)){
            System.out.println("Record found");
        }else{
            System.out.println("Record not found");
        }

        map.clear();
        System.out.println(map);
    }
}

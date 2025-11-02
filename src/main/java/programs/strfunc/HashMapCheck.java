package programs.strfunc;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapCheck {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put(null, null);
        map.put(null, "java");
        map.put("Sanjay", "Yadav");
        map.put("Ajay", "Koushik");
        map.put("Sanjay", "Dhiwar");
        map.put("ajay", "Koushik");

        map.entrySet()
                .forEach(kv -> System.out.println(kv.getKey() + " "+ kv.getValue()));

        System.out.println();

        Hashtable<String, String> table = new Hashtable<>();
        table.put(null, null);
        table.put(null, "java");
        table.entrySet().stream()
                .forEach(kv -> System.out.println(kv.getKey() + " "+ kv.getValue()));
    }
}

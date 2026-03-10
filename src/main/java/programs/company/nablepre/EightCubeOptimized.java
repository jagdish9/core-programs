package programs.company.nablepre;

import java.util.*;

public class EightCubeOptimized {

    public static void main(String[] args) {

        int n = 50;

        Map<Integer, List<String>> map = new HashMap<>();

        for(int a=1; a<n; a++){
            for(int b=1; b<n; b++){
                int sum = a*a*a + b*b*b;
                String pair = a + "," + b;
                map.computeIfAbsent(sum, k -> new ArrayList<>()).add(pair);
                /*if(!map.containsKey(sum)) {
                    List<String> ls = new ArrayList<>();
                    ls.add(pair);
                    map.put(sum, ls);
                }*/
            }
        }

        for(int sum : map.keySet()){
            List<String> pairs = map.get(sum);
            if(pairs.size() > 1){
                System.out.println(sum + " -> " + pairs);
            }
        }
    }
}

package programs.map;

import java.util.*;

public class SortByValue {
    private final Map<Integer, String> map = new HashMap<>();

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Integer key, String value) {
        this.map.put(key, value);
    }

    public static void main(String[] args) {
        SortByValue sortByValue = new SortByValue();
        sortByValue.setMap(10, "Anamika");
        sortByValue.setMap(20, "Sanyokita");
        sortByValue.setMap(30, "Jyotsna");
        sortByValue.setMap(40, "Bhumika");
        sortByValue.setMap(50, "Manyata");
        sortByValue.setMap(60, "Kanchani");
        sortByValue.setMap(70, "Aryamati");

        System.out.println("Before sorting");
        for(Map.Entry<Integer, String> mEntry : sortByValue.getMap().entrySet()) {
            System.out.println(mEntry.getKey() +" -> "+ mEntry.getValue());
        }

        List<Map.Entry<Integer, String>> dList = new ArrayList<>(sortByValue.getMap().entrySet());
        Collections.sort(dList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println();
        System.out.println("After Sorting");
        for(Map.Entry<Integer, String> mEntry : dList) {
            System.out.println(mEntry.getKey() +" -> "+ mEntry.getValue());
        }
    }
}

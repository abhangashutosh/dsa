package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<HashMap<String, Integer>> mylist = new ArrayList<>();

        HashMap<String, Integer> data1 = new HashMap<>();

        data1.put("Ashutosh", 1);
        data1.put("Darshan", 2);
        data1.put("Darshan", 3);


        HashMap<String, Integer> data2 = new HashMap<>();

        data2.put("10", 10);
        data2.put("11", 20);
        data2.put("12", 30);

        mylist.add(data1);
        mylist.add(data2);

        for (HashMap<String, Integer> stringIntegerHashMap : mylist) {

            Set<String> key = (stringIntegerHashMap).keySet();
            for (String hmKey : key) {
                Integer hmData = (stringIntegerHashMap).get(hmKey);

                System.out.println("Key: " + hmKey + " & Data :" + hmData);

            }

        }
    }
}

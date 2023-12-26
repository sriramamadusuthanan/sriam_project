package problem1to10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsExample {

    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList Example:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println();

        // LinkedList Example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("LinkedList Example:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // HashSet Example
        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(2.5);
        hashSet.add(5.0);
        hashSet.add(3.8);

        System.out.println("HashSet Example:");
        for (Double number : hashSet) {
            System.out.println(number);
        }
        System.out.println();

        // HashMap Example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        System.out.println("HashMap Example:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}


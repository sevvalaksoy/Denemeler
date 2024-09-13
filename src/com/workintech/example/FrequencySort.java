package com.workintech.example;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 5, 5, 5, 5, 1, 1, 1, 4, 4);
        itemsSort(list);
    }
    public static List<Integer> itemsSort(List<Integer> items) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < items.size(); i++) {
            int item = items.get(i);
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        Map<Integer, List<Integer>> groupedByFrequency = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            if (!groupedByFrequency.containsKey(frequency)) {
                groupedByFrequency.put(frequency, new ArrayList<>());
            }
            groupedByFrequency.get(frequency).add(value);
        }

        for (List<Integer> values : groupedByFrequency.values()) {
            Collections.sort(values);
        }

        List<Integer> sortedItems = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : groupedByFrequency.entrySet()) {
            int frequency = entry.getKey();
            List<Integer> values = entry.getValue();
            for (int value : values) {
                for (int i = 0; i < frequency; i++) {
                    sortedItems.add(value);
                }
            }
        }
        System.out.println(sortedItems);
        return sortedItems;
    }
}

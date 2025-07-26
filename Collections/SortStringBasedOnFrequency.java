package Collections;

import java.util.*;
public class SortStringBasedOnFrequency {
    public static void main(String[] args) {
        String str = "aaabbbbcdd";
        String sorted = frequency(str);
        System.out.println(sorted);
    }
    public static String frequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

package com.example.practice.problems.arrays;

import java.lang.reflect.Array;
import java.util.*;

public class GroupValidAnagram {
    public GroupValidAnagram() {}

    public List<List<String>> groupAnagram(String[] str) {
        Map<String, List<String>> mapGroups = new HashMap<>();

        List<List<String>> groups = new ArrayList<>();
        if(str.length <= 1) {
            groups.add(List.of(str[0]));
            return groups;
        }

        for (String s: str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if(!mapGroups.containsKey(sortedWord)) {
                mapGroups.put(sortedWord, new ArrayList<>());
            }

            mapGroups.get(sortedWord).add(s);
        }

        mapGroups.forEach((key, value) -> groups.add(value));

        return groups;
    }
}

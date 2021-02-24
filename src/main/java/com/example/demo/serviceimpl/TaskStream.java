package com.example.demo.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class TaskStream {

    public Map<Character, Integer> countOfTheMostCommonCharacter(String str) {
        Map<Character, Integer> result = new HashMap<>();

        List<Character> chars = str.chars()
                .mapToObj(e -> (char) e)
                .collect(toList());

        Integer count = chars.stream()
                .collect(groupingBy(Character::charValue))
                .values().stream()
                .map(List::size)
                .mapToInt(value -> value)
                .max().orElse(0);

        Character value = chars.stream()
                .collect(groupingBy(Character::charValue))
                .entrySet().stream()
                .filter(characterListEntry -> count.equals(characterListEntry.getValue().size()))
                .collect(toList()).get(0).getKey();

        result.put(value, count);

        return result;

    }
}

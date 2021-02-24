package com.example.demo.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class TaskStream {

    public Map<Character, Integer> countOfTheMostCommonCharacter(String str) {

        Map<Character, Integer> result = new HashMap<>();

        Integer count = str.chars()
                .mapToObj(symbol -> (char) symbol)
                .collect(groupingBy(Character::charValue))
                .values().stream()
                .map(List::size)
                .mapToInt(Integer::valueOf)
                .max().orElse(0);

        Character value = str.chars()
                .mapToObj(symbol -> (char) symbol)
                .collect(groupingBy(Character::charValue))
                .entrySet().stream()
                .filter(characterListEntry -> count.equals(characterListEntry.getValue().size()))
                .findFirst().get().getKey();

        result.put(value, count);

        return result;

    }

}

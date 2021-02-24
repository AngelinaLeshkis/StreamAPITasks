package com.example.demo.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class TaskStream {

    public Map<Character, Integer> countOfTheMostCommonCharacter(String input) {

        Map<Character, Integer> result = new HashMap<>();

        Integer count = getCharacterStream(input)
                .collect(groupingBy(Character::charValue))
                .values().stream()
                .map(List::size)
                .mapToInt(Integer::valueOf)
                .max().orElse(0);

        Character value = getCharacterStream(input)
                .collect(groupingBy(Character::charValue))
                .entrySet().stream()
                .filter(characterListEntry -> count.equals(characterListEntry.getValue().size()))
                .findFirst().get().getKey();

        result.put(value, count);

        return result;

    }

    private Stream<Character> getCharacterStream (String input) {
        return input.chars().mapToObj(symbol -> (char) symbol);
    }

}

package com.practice.example.core;

import java.util.*;
import java.util.stream.Collectors;

public class JustifiedText {

    public static void main(String[] args) throws Exception {
        // Input: ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
        List<String> response = fullJustify(
                new String[]{"This", "is", "an", "example", "of", "text", "justification."},
                3);
        System.out.println(response);
    }

    public static List<String> fullJustify(String[] words, int maxWidth) throws Exception {

        if (words.length < 1) {
            throw new Exception("At least one word should be passed as input");
        }

        List<String> textList = Arrays.asList(words)
                .stream()
                .map(word -> word.concat(" "))
                .collect(Collectors.toList());

        Set result = new HashSet();

        final StringBuilder[] sb = {new StringBuilder()};
        textList.forEach(text -> {
            if (text.length() <= maxWidth) {
                sb[0].append(text);
                result.add(sb[0]);
            } else {
                sb[0] = new StringBuilder();
                sb[0].append(text);
                result.add(sb[0]);
            }
        });
        return (List<String>) result.stream().collect(Collectors.toList());
    }
}

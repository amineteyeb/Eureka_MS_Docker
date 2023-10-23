package com.example.gestioncommunication.Entities;

import java.util.Arrays;
import java.util.List;

public class BadWordsFilter {

    private static final List<String> BAD_WORDS = Arrays.asList("badword1", "badword2", "badword3");

    public static boolean containsBadWords(String comment) {
        String[] words = comment.split(" ");
        for (String word : words) {
            if (BAD_WORDS.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

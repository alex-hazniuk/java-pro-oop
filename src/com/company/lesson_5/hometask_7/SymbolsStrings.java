package com.company.lesson_5.hometask_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SymbolsStrings {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findSymbolOccurrence("String line", 'i'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(stringReverse("null"));
        System.out.println(isPalindrome("Mr. Owl ate my metal worm"));

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessWord(words);
    }

    private static int findSymbolOccurrence(String line, char symbol) {
        int count = 0;
        if (line != null) {
            for (char value : line.toCharArray()) {
                if (value == symbol) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int findWordPosition(String source, String target) {
        return source != null && source.contains(target) ? source.indexOf(target) : -1;
    }

    private static String stringReverse(String line) {
        String reverseLine = "";
        if (line != null) {
            StringBuilder builder = new StringBuilder(line);
            reverseLine = builder.reverse().toString();
        }
        return reverseLine;
    }

    private static boolean isPalindrome(String line) {
        if (line == null) {
            return false;
        }
        StringBuilder builder = new StringBuilder();
        for (String value : line.split("\\W+")) {
            builder.append(value);
        }
        return builder.toString().equalsIgnoreCase(builder.reverse().toString());
    }

    private static void guessWord(String[] words) {
        if (words != null && words.length > 0) {
            int index = new Random().nextInt(words.length);
            String takenWord = words[index];
            char[] sharps = new char[15];
            Arrays.fill(sharps, '#');
            if (takenWord != null) {
                System.out.println("Guess taken word");
                String word = "";
                while (!takenWord.equals(word)) {
                    word = scanner.nextLine();
                    for (int i = 0; i < takenWord.length() && i < word.length(); i++) {
                        if (takenWord.charAt(i) == word.charAt(i)) {
                            sharps[i] = word.charAt(i);
                        }
                    }
                    System.out.println(sharps);
                }
                System.out.println("You guessed word - " + word);
            }
        } else {
            System.out.println("No words to guess!");
        }
    }
}

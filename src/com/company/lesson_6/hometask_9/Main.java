package com.company.lesson_6.hometask_9;

import com.company.lesson_6.hometask_9.phonebook.Phonebook;
import com.company.lesson_6.hometask_9.phonebook.Record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(null);
        phonebook.add(new Record("Kate", "098"));
        phonebook.add(new Record("Kate", "099"));
        phonebook.add(new Record("Lucia", "097"));
        System.out.println(phonebook.find("Kate"));
        System.out.println(phonebook.findAll("Kate"));

        List<String> fruits = List.of("Apricot", "Apple", "Plum", "Apricot", "Orange",
                "Orange", "Apple", "Pineapple", "Apple", "Pear");
        System.out.println(countOccurance(fruits, "Apple"));

        String[] names = {"John", "Kira", "Kate"};
        System.out.println(toList(names));

        List<Integer> numbers = List.of(1, 0, 0, 1, 2, 2, 2);
        System.out.println(findUnique(numbers));

        List<String> animals = List.of("fox", "fox", "cow", "bird", "cow", "cow");
        calcOccurance(animals);

        List<String> set = new ArrayList<>(animals);
        System.out.println(findOccurance(set));
    }

    private static int countOccurance(List<String> words, String pointedWord) {
        int count = 0;
        if (words != null) {
            for (String word : words) {
                if (word != null && word.equals(pointedWord)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static <T> List<T> toList(T[] values) {
        return values != null ? Arrays.asList(values) : Collections.emptyList();
    }

    private static Set<Integer> findUnique(List<Integer> numbers) {
        return numbers != null ? new HashSet<>(numbers) : Collections.emptySet();
    }

    private static void calcOccurance(List<String> list) {
        if (list != null) {
            Set<String> set = new HashSet<>(list);
            for (String value : set) {
                int count = 0;
                for (String word : list) {
                    if (Objects.equals(value, word)) {
                        count++;
                    }
                }
                System.out.println(value + ": " + count);
            }
        } else {
            System.out.println("List isn`t initialized!");
        }
    }

    private static List<String> findOccurance(List<String> list) {
        List<String> occurrences = new ArrayList<>();
        if (list != null) {
            Set<String> set = new HashSet<>(list);
            for (String value : set) {
                int count = 0;
                for (String word : list) {
                    if (Objects.equals(value, word)) {
                        count++;
                    }
                }
                occurrences.add(String.format("{name: \"%s\", occurrence: %d}", value, count));
            }
            return occurrences;
        }
        return Collections.emptyList();
    }
}

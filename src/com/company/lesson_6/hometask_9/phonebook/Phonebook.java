package com.company.lesson_6.hometask_9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private final List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record != null
                    && record.getName() != null
                    && record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> recordsWithProperName = new ArrayList<>();
        for (Record record : records) {
            if (record != null
                    && record.getName() != null
                    && record.getName().equals(name)) {
                recordsWithProperName.add(record);
            }
        }
        return !recordsWithProperName.isEmpty() ? recordsWithProperName : null;
    }
}

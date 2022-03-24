package ru.yandex.model;

import java.util.ArrayList;

public class Epic extends Task {

    public Epic(int id) {
        super(id);
    }
    ArrayList<Subtask> subtasks;
}

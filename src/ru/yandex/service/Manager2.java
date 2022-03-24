package ru.yandex.service;

import ru.yandex.model.Epic;
import ru.yandex.model.Subtask;
import ru.yandex.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Manager2 {
    private final HashMap<Integer, Task> tasksById;

    public Manager2() {
        this.tasksById = new HashMap<>();
    }

    Task getById(int id) {
        return tasksById.get(id);
    }

    void deleteById(int id) {
        //..
    }

    ArrayList<Epic> getAllEpics() {
        //...
        for (Task t : tasksById.values()) {
            if (t instanceof Epic) {
                //...
            }
        }
        return null;
    }

    ArrayList<Epic> getAllTasks() {
        //...
        for (Task t : tasksById.values()) {
            if (t.getClass() == Task.class) {
                //...
            }
        }
        return null;
    }
}

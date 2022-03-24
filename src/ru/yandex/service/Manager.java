package ru.yandex.service;

import ru.yandex.model.Epic;
import ru.yandex.model.Subtask;
import ru.yandex.model.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
    private static int nextId;

    HashMap<Integer, Task> tasksById;
    HashMap<Integer, Subtask> subtasksById;
    HashMap<Integer, Epic> epicsById;

    public Manager() {
        nextId = 1;
        this.tasksById = new HashMap<>();
        this.subtasksById = new HashMap<>();
        this.epicsById = new HashMap<>();
    }

    public int getNewId() {
        return nextId++;
    }

    ArrayList<Task> getAllTasks() {
        //...
        return null;
    }

    Task getTaskById(int id) {
        //...
        return null;
    }

    public void addTask(Task task) {
        //task.setId(nextId++);
    }

    //..


    //.. Subtask
    Subtask getSubtaskById(int id) {
        //..
        return null;
    }

    // ..Epic

    void updateEpic(Epic epic) {
        //epicsById.put(task.getId(), task);
        Epic currentEpic = epicsById.get(epic.getId());
        currentEpic.setStatus(epic.getStatus());
        currentEpic.setName(epic.getName());
        //..
    }
}

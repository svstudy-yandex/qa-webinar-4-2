package ru.yandex.model;

public class Subtask extends Task {
    private int parentId;

    public Subtask(int id) {
        super(id);
    }

    public int getParentId() {
        return parentId;
    }

    public void setParent(int parentId) {
        this.parentId = parentId;
    }
}

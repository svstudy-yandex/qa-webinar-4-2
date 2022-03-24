package ru.yandex;

import ru.yandex.model.Epic;
import ru.yandex.model.Task;
import ru.yandex.service.Manager;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        /*
        Task task = new Task();
        task.setName("Test");
        task.setStatus("NEW");
        manager.addTask(task);

         */

        Task a = new Epic(1);
        Task b = new Task(2);

        System.out.println(a.getClass());
        System.out.println(b.getClass());

    }
}

package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> annTasks = new HashSet<>();
        annTasks.add(new Task("Proj1", "Login sayfası", "Ann", Priority.HIGH, Status.IN_PROGRESS));

        Set<Task> bobTasks = new HashSet<>();
        bobTasks.add(new Task("Proj1", "Database bağlantısı", "Bob", Priority.MED, Status.ASSIGNED));

        Set<Task> carolTasks = new HashSet<>();
        carolTasks.add(new Task("Proj2", "Frontend tasarımı", "Carol", Priority.LOW, Status.IN_QUEUE));

        Set<Task> unassigned = new HashSet<>();
        unassigned.add(new Task("Proj3", "Test yazma", null, Priority.MED, Status.IN_QUEUE));

        TaskData data = new TaskData(annTasks, bobTasks, carolTasks, unassigned);

        System.out.println("Tüm görevler:");
        System.out.println(data.getTasks("all"));

        System.out.println("\nAnn görevleri:");
        System.out.println(data.getTasks("ann"));

        System.out.println("\nUnique kelimeler (örnek StringSet):");
        System.out.println(StringSet.findUniqueWords().size() + " unique kelime bulundu.");
    }
}

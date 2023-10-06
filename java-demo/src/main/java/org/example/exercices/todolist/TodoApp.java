package org.example.exercices.todolist;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Afficher les tâches");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Lire la fin de la ligne après le choix

            switch (choice) {
                case 1:
                    System.out.print("Description de la tâche : ");
                    String description = scanner.nextLine();
                    Task task = new Task();
                    task.setDescription(description);
                    todoList.addTask(task);
                    System.out.println("Tâche ajoutée !");
                    break;
                case 2:
                    System.out.println("Liste des tâches :");
                    for (int i = 0; i < todoList.getSize(); i++) {
                        Task t = todoList.getTask(i);
                        System.out.println(i + 1 + ". [" + (t.isCompleted() ? "X" : " ") + "] " + t.getDescription());
                    }
                    break;
                case 3:
                    System.out.print("Numéro de la tâche à marquer comme terminée : ");
                    int indexToComplete = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToComplete >= 1 && indexToComplete <= todoList.getSize()) {
                        Task taskToComplete = todoList.getTask(indexToComplete - 1);
                        taskToComplete.setCompleted(true);
                        System.out.println("Tâche marquée comme terminée !");
                    } else {
                        System.out.println("Numéro de tâche invalide.");
                    }
                    break;
                case 4:
                    System.out.print("Numéro de la tâche à supprimer : ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToRemove >= 1 && indexToRemove <= todoList.getSize()) {
                        todoList.removeTask(indexToRemove - 1);
                        System.out.println("Tâche supprimée !");
                    } else {
                        System.out.println("Numéro de tâche invalide.");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }
}

package gmail.smoljarn.lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");// Зчитуємо розмір масиву
        int n = scanner.nextInt();

        int[] array1 = new int[n];


        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();


        while (true) {
            // Виводимо меню
            System.out.println("Меню:");
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне всіх елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");

            // Зчитуємо вибір користувача
            System.out.print("Виберіть дію (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int totalSum = 0;
                    for (int i = 0; i < n; i++) {
                        totalSum += array1[i];
                    }
                    System.out.println("Сума елементів: " + totalSum);
                    break;

                case 2:
                    if (n > 0) {
                        double average = 0;
                        for (int i = 0; i < n; i++) {
                            average += array1[i];
                        }
                        average /= n;
                        System.out.println("Середнє арифметичне: " + average);
                    } else {
                        System.out.println("Масив порожній!");
                    }
                    break;
                case 3:
                    if (n > 0) {
                        int maxElement = array1[0];
                        for (int i = 1; i < n; i++) {
                            if (array1[i] > maxElement) {
                                maxElement = array1[i];
                            }
                        }
                        System.out.println("Найбільший елемент: " + maxElement);
                    } else {
                        System.out.println("Масив порожній!");
                    }
                    break;

                case 4:
                    System.out.println("Програма завершена.");
                    scanner.close();
                    return;


            }
        }

        

    }
}

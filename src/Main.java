import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Задание 1-7, 0 - выход: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> task1.run();
                case 2 -> task2.run();
                case 3 -> task3.run();
                case 4 -> task4.run();
                case 5 -> task5.run();
                case 6 -> task6.run();
                case 7 -> task7.run();
                case 0 -> { return; }
                default -> System.out.println("Ошибка");
            }
        }
    }
}
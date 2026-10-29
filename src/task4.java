import java.util.*;

public class task4 {
    public static void run() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Иванов", 4.5, 20));
        list.add(new Student("Петров", 3.8, 19));
        list.add(new Student("Сидоров", 4.9, 21));
        list.add(new Student("Емельяненко", 4.2, 22));

        System.out.println("По фамилии:");
        list.sort(Comparator.comparing(Student::getSurname));
        for (Student s : list) System.out.println(s);

        System.out.println("По среднему баллу:");
        list.sort(Comparator.comparingDouble(Student::getAverage));
        for (Student s : list) System.out.println(s);

        System.out.println("По возрасту:");
        list.sort(Comparator.comparingInt(Student::getAge));
        for (Student s : list) System.out.println(s);
    }
}
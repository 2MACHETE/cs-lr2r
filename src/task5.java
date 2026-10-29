import java.util.*;

public class task5 {
    public static void run() {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("Иванов", 4.5, 20));
        set.add(new Student("Петров", 3.8, 19));
        set.add(new Student("Иванов", 3.0, 25));
        set.add(new Student("Сидоров", 4.9, 21));
        set.add(new Student("Петров", 4.0, 22));
        set.add(new Student("Кузнецов", 4.2, 23));
        for (Student s : set) System.out.println(s);
    }
}
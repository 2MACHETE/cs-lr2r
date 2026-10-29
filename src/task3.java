import java.util.*;

public class task3 {
    public static void run() {
        TreeMap<Student, Student> map = new TreeMap<>();
        Student a = new Student("Иванов", 4.5, 20);
        Student b = new Student("Петров", 3.8, 19);
        Student c = new Student("Сидоров", 4.9, 21);
        Student d = new Student("Кузнецов", 4.2, 22);
        map.put(a, a);
        map.put(b, b);
        map.put(c, c);
        map.put(d, d);
        for (Student s : map.values()) System.out.println(s);
    }
}
import java.util.*;

public class task1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 10 фамилий:");
        for (int i = 0; i < 10; i++) list.add(sc.nextLine());

        Collections.sort(list);
        System.out.println("Отсортированный список: " + list);

        System.out.println("Количество вхождений:");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (list.indexOf(s) == i) {
                System.out.println(s + ": " + Collections.frequency(list, s));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            while (list.lastIndexOf(s) != i) {
                list.remove(list.lastIndexOf(s));
            }
        }
        System.out.println("Без повторов: " + list);
    }
}
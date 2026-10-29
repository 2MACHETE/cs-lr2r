import java.util.*;

public class task2 {
    public static void run() {
        int add = 1000000, del = 1000;

        ArrayList<Integer> arrlist = new ArrayList<>();
        long t = System.nanoTime();
        for (int i = 0; i < add; i++) arrlist.add(i);
        long alAdd = System.nanoTime() - t;
        t = System.nanoTime();
        for (int i = 0; i < del; i++) arrlist.remove(0);
        long alDel = System.nanoTime() - t;

        LinkedList<Integer> linklist = new LinkedList<>();
        t = System.nanoTime();
        for (int i = 0; i < add; i++) linklist.add(i);
        long llAdd = System.nanoTime() - t;
        t = System.nanoTime();
        for (int i = 0; i < del; i++) linklist.removeFirst();
        long llDel = System.nanoTime() - t;

        System.out.printf("ArrayList:  add = %d ms, remove = %d ms%n", alAdd / 1000000, alDel / 1000000);
        System.out.printf("LinkedList: add = %d ms, remove = %d ms%n", llAdd / 1000000, llDel / 1000000);
    }
}
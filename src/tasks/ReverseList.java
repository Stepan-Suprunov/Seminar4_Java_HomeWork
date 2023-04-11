// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

package tasks;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseList {
    public static Deque reverseList(LinkedList list) {
        Deque<String> myDeque = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            myDeque.push((String) list.get(i));
        }
        return myDeque;
    }
}

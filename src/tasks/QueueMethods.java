package tasks;

import java.util.Queue;

public class QueueMethods {
    public static Queue enqueue(Queue que, String str) {
        que.add(str);
        return que;
    }

    public static void first(Queue que) {
        System.out.println(que.peek());
    }

    public static Queue dequeue(Queue que) {
        System.out.println(que.poll());
        return que;
    }
}

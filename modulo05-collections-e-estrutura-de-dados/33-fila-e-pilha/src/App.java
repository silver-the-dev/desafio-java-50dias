import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Douglas");
        queue.offer("Jonathan");
        queue.offer("Maria");
        queue.offer("Pedro");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}

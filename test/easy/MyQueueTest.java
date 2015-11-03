package easy;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println(queue.empty());
        queue.push(1);
        System.out.println(queue.peek());
        queue.push(2);
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue.peek());
    }
}

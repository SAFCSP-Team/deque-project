import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Deque deque = new Deque();

        deque.addFirst(new User(1, "Khaled"));
        deque.addFirst(new User(2, "Sara"));

        deque.addLast(new User(4, "Ahmed"));
        deque.addLast(new User(6, "Lama"));

        deque.addFirst(new User(3, "Khaled"));

        System.out.println("user removed "+ deque.removeFirst().name);
        System.out.println("user removed "+deque.removeLast().name);

        System.out.println("user removed "+deque.removeFirst().name);

    }
}

public class Deque {

    public Node front;
    public Node rear;

    Deque() {
        this.front = null;
        this.rear = null;
    }

    public void addFirst(User newData) {
        if (this.front!= null){
        Node newNode;
        newNode = new Node(newData);
        newNode.next = this.front;
        this.front.previews = newNode;
        this.front = newNode;

    }else{
        Node newNode;
        newNode = new Node(newData);
        this.front =newNode;
        this.rear = newNode;
        }
    
    }

    public void addLast(User newData) {
        if(this.rear != null){
        Node newNode;
        newNode = new Node(newData);
        newNode.previews = this.rear;
        this.rear.next = newNode;
        this.rear = newNode;
        }else{
            Node newNode;
            newNode = new Node(newData);
            this.front =newNode;
            this.rear = newNode;
        }
    }

    public User removeFirst() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        Node removeadNode = this.front;
        if (front == rear){
            this.front = null;
            this.rear = null;

        }else{
            this.front = this.front.next;
            this.front.previews =null;
        }

        return removeadNode.data;
    }

    public User removeLast() {


        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        Node removeadNode = this.rear;
        if (front == rear){
            this.front = null;
            this.rear = null;

        }else{
            this.rear = this.rear.previews;
            this.rear.next = null;
        }

        return removeadNode.data;
    }


public User getFront() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        return front.data;
    }

    public User getRear() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        return rear.data;
    }

    // Bonus Challenge: Print the Deque backward
}

class CircularQueue {

    int arr[];
    int front;
    int rear;
    int size;

    // Constructor
    public CircularQueue(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    // Check whether queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check whether queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Add element
    public void add(int data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = data;
        System.out.println(data + " added");
    }

    // Remove element
    public void remove() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " removed");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // See front element
    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    // Display queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        System.out.println("Is Empty: " + q.isEmpty());

        q.add(10);
        q.add(20);
        q.add(30);

        q.display();

        System.out.println("Front: " + q.peek());

        q.remove();

        q.display();

        q.add(40);
        q.add(50);
        q.add(60);

        q.display();

        System.out.println("Is Full: " + q.isFull());

        q.remove();

        q.display();

        q.add(70);

        q.display();

        System.out.println("Front: " + q.peek());
        System.out.println("Is Full: " + q.isFull());
    }
}
package programs.company.altimetrikclient2;

public class CircularQueueWorking {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public static void main(String[] args) {
        CircularQueueWorking circularQueue = new CircularQueueWorking(3);
        System.out.println(circularQueue.enQueue(1)); // return True
        System.out.println(circularQueue.enQueue(2)); // return True
        System.out.println(circularQueue.enQueue(3)); // return True
        System.out.println(circularQueue.enQueue(4)); // return False
        System.out.println(circularQueue.rear());     // return 3
        System.out.println(circularQueue.isFull());   // return True
        System.out.println(circularQueue.deQueue());  // return True
        System.out.println(circularQueue.enQueue(4)); // return True
        System.out.println(circularQueue.rear());     // return 4
    }

    public CircularQueueWorking(int k) {
        queue = new int[k];
        front = 0;
        rear = -1;
        size = 0;
        capacity = k;
    }

    public boolean enQueue(int value) {
        if(isFull())
            return false;
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty())
            return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int front() {
        if(isEmpty())
            return -1;
        return queue[front];
    }

    public int rear() {
        if(isEmpty())
            return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

/*
Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle, and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".
One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.
Implement the MyCircularQueue class:
MyCircularQueue(k) Initializes the object with the size of the queue to be k.
int Front() Gets the front item from the queue. If the queue is empty, return -1.
int Rear() Gets the last item from the queue. If the queue is empty, return -1.
boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
boolean isEmpty() Checks whether the circular queue is empty or not.
boolean isFull() Checks whether the circular queue is full or not.
You must solve the problem without using the built-in queue data structure in your programming language.

Example 1:
Input["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]
Output[null, true, true, true, false, 3, true, true, true, 4]
Explanation MyCircularQueue myCircularQueue = new MyCircularQueue(3);
myCircularQueue.enQueue(1); // return True
myCircularQueue.enQueue(2); // return True
myCircularQueue.enQueue(3); // return True
myCircularQueue.enQueue(4); // return False
myCircularQueue.Rear();     // return 3
myCircularQueue.isFull();   // return True
myCircularQueue.deQueue();  // return True
myCircularQueue.enQueue(4); // return True
myCircularQueue.Rear();     // return 4

1 2 3

queue is full

1-based indexing

f = 1
r = 3

rear() -> 3

dequeue -> delete 1

f = 2

___ 2 3

r = 3

r = 1

4 2 3

rear() = 4

front() = 2

 */
package Th3ArrayQueue;

import java.util.Arrays;

public class MyQueue {

    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public MyQueue(int capacity, int[] queueArr, int head, int tail, int currentSize) {
        this.capacity = capacity;
        this.queueArr = queueArr;
        this.head = head;
        this.tail = tail;
        this.currentSize = currentSize;
    }

    public MyQueue() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getQueueArr() {
        return queueArr;
    }

    public void setQueueArr(int[] queueArr) {
        this.queueArr = queueArr;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueEmpty()) {
            System.out.println("Overflow 1 Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is push to Queue!");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Overflow 1 Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    @Override
    public String toString() {
        return "MyQueue [capacity=" + capacity + ", queueArr=" + Arrays.toString(queueArr) + ", head=" + head
                + ", tail=" + tail + ", currentSize=" + currentSize + "]";
    }
}

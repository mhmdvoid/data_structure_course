package com.mohmdev.data_structure;

public class Queue {

    int array[];
    int front;   // keep track of the first;
    int rear;

    public Queue(int max) {
        array = new int[max];
        front = rear = 0;
    }

    public boolean enqueue(int element) {
        if (isFull()) {
            System.out.println("Buffer overflow ...");
            return false;
        }
        this.array[rear++] = element;
        return true;

    }

    public int dequeue() {


        if (isEmpty()) {
            System.out.println("Buffer underflow");
            return 0;
        }
        var tmp = array[front];
        if (front == rear) {  // Single element;
            front = rear = 0; // Back to 0 which means empty queue;
        } else {
            front++;
        }
        return tmp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Buffer underflow");
            return 0;
        }

        return array[front];

    }
    public boolean isFull() {
        return rear == array.length;
    }

    public boolean isEmpty() {
        return front == 0 && rear == 0;
    }
    // Queue = [10, 20, 430, 10]
    //   front  ^             ^ rear
}

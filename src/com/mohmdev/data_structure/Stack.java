package com.mohmdev.data_structure;

// ADT
public interface Stack<E> {

    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
}


// Data structure
class StackArray<E> implements Stack<E> {

    E[] array;
    int stackPointer = 0;  // top;
    public StackArray(int max) {
        array = (E[]) new Object[max];
    }

    @Override
    public void push(E element) {
        if (isFull()) {
            System.out.println("Stack overflow ... ");
            return;
        }

        array[stackPointer++] = element;
    }

    @Override
    public E pop() {

        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }

        return array[--stackPointer];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow...");
            return null;
        }
        return array[stackPointer];
    }

    @Override
    public boolean isEmpty() {
        return stackPointer == 0;
    }

    private boolean isFull() {
        return stackPointer == array.length;
    }

    public static void main(String[] args) {
        var intStack = new StackArray<Integer>(5);
        intStack.push(1);
        intStack.push(2);

    }
}


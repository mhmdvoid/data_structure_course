package com.mohmdev.data_structure;

import java.util.NoSuchElementException;

class Node<E extends Comparable<E>> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

class ListIterator<E extends Comparable<E>> {
    Node<E> begin;

    public ListIterator(Node<E> begin) {
        this.begin = begin;
    }

    public boolean hasNext() {
        return begin != null;
    }

    public E next() {
        if (hasNext()) {
            var data = begin.data;
            begin = begin.next;  // Move it;
            return data;
        }
        throw new NoSuchElementException();
    }
}
public class LinkedList<E extends Comparable<E>> {

    Node<E> head = null;
    int numElems = 0;

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            numElems++;
            return;
        }
        newNode.next = head;
        head = newNode;
        numElems++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            var current = head;
            while (current.next != null) { // move the current cursor all the way till the end;
                current = current.next;
            }
            current.next = newNode;
        }
        numElems ++;
    }

    public E removeFirst() {

        if (head == null) {
            return null;
        }
        var firstData = head.data;
        head = head.next;
        numElems --;
        return firstData;

    }

    public E removeLast() {
        if (head == null)
            return null;
        if (numElems == 1) return removeFirst();
        var prev = head;
        var current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        var tmp = current.data;
        prev.next = null; // unlink last one
        numElems --;
        return tmp;
    }

    public boolean contains(E element){
        Node<E> current = head;   // if no element added then this == null and will not take the loop
        while (current != null) {
            if (current.data.compareTo(element) == 0)
                return true;
            current = current.next;
        }
        return false;
    }

    public ListIterator<E> iterator() {
        return new ListIterator<>(head);
    }

    public static void main(String[] args) {
        var integerList = new LinkedList<Integer>();
        var stringList = new LinkedList<String>();
        integerList.addFirst(10);
        integerList.addFirst(30);

        stringList.addLast("Mohammed");
        stringList.addLast("Sara");
        stringList.addLast("Waleed");

        var stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            if (stringIterator.next().equals("Sara"))
                System.out.println("She is a girl");
        }

    }
}
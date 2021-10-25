package com.mohmdev.data_structure;

// Dynamic array to implement List ADT, add, remove, search/contains set
public class DynamicArray {  // Same like ArrayList;

    private int size; // Max
    private int numElems;
    private int[] array;

    public DynamicArray(int size) {
        this.size = size;
        array = new int[size];
    }

    // Default: if size isn't provided
    public DynamicArray() {
        this(10);
    }

    public boolean add(int element) {
        if (numElems >= size)
            resize(size); // Mutate size;

        array[numElems++] = element;
        return true;
    }

    private void resize(int oldSize) {
        this.size = oldSize * 2;  // New size;
        var tempArray = new int[size]; // [10, 5, 7], new = [10,5, 7, 0, 0, 0]
        for (int i = 0; i < tempArray.length; i ++) {
            if (i >= array.length)
                tempArray[i] = 0; // You can default it, null, 0, etc..
            else
                tempArray[i] = array[i];  // new[0] = old[0] [10, 5, 7, 0 0 0 0 ], old = [ 10, 5, 7]
        }
        array = tempArray; // oldArray points/refers to same location of new

    }

    public boolean remove(int element) {
        if (!contains(element) || numElems == 0)
            return false; // Fail to remove

        for (var indexOfElement = findIndexOf(element);indexOfElement < numElems - 1; indexOfElement ++) {  // swap starting from found
            array[indexOfElement] = array[indexOfElement + 1];
        }
        array[--numElems] = 0; // As default!
        return true;
    }

    // Linear search !
    public int findIndexOf(int element) {
        for (var i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    public boolean contains(int element) {

        for (int eachElement : array) {
            if (eachElement == element) return true;
        }
        return false;
    }


    public int max() {
        if (numElems == 0) return -1;
        int max = array[0];
        for (int element : array)
            if (max < element) {
                // Element then is the maximum
                max = element;
        }
        return max;
    }
    public int min() {
        int min = array[0];
        for (int element : array) {
            if (min > element)
                min = element;
        }
        return min;
    }

    public void print() {
        for (int i = 0; i < length(); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int length() {
        return numElems;
    }

    public static void main(String[] args) {
        var dynList = new DynamicArray(2); // [0, 0]
        dynList.add(10);
        dynList.add(102);
        dynList.add(10332);


        // if (number == 10) true
        dynList.print();
    }
}


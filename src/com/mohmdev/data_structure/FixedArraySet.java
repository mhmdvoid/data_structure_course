package com.mohmdev.data_structure;

import java.util.ArrayList;
import java.util.List;

// Dynamic Vs Fixed size
public class FixedArraySet {  // Fixed-Array Set implementation

    private int size; // Maximum size;
    private int numElems = 0;
    private int[] holder;

    // ArraySet mySet = new ArraySet(10)
    public FixedArraySet(int maxSize) {
        this.size = maxSize;
        this.holder = new int[maxSize];
    }
    public FixedArraySet() {
        this(10); // DEFAULT
    }
    public boolean add(int element) {  // [10, 20, 10, 0, 0]
                            //                            ^
        if (numElems >= size || contains(element)) {
            System.out.println("Sorry full or duplicate");
            return false; // Fail to add
        }

        holder[numElems++] = element;
        return true;
    }

    public boolean remove(int element) {
        if (!contains(element) || numElems == 0)
            return false; // Fail to remove

        for (var indexOfElement = findIndexOf(element);indexOfElement < numElems - 1; indexOfElement ++) {  // swap starting from found
            holder[indexOfElement] = holder[indexOfElement + 1];
        }
        holder[--numElems] = 0; // As default!
        return true;
    }

    private void print() {
        for (var i = 0; i < numElems; i++)
            System.out.println(this.holder[i]);
    }

    // element = 10

    // Linear
    public boolean contains(int element) {

        for (int eachElem : holder) {
            if (eachElem == element)
                return true; // Found
        }
        // [10, 20, 0,23]
//                               ^
        return false;
    }

    // Linear search !
    public int findIndexOf(int element) {
        for (var i = 0; i < holder.length; i++) {
            if (holder[i] == element)
                return i;
        }
        return -1;  // Can't have negative index
    }
    public int length() {
        return numElems;
    }


    public static void main(String[] args) {

        ArrayList<String> dynamicList = new ArrayList<>(10);

        // 10 [0 ,0 ,0 ,0 ,0 ,0 0, 0]
        // grow/expand
        FixedArraySet mySet = new FixedArraySet();
        mySet.add(10);
        mySet.add(4);
        mySet.add(6);
        mySet.add(2);
        mySet.add(13);
        mySet.add(133);
        mySet.add(133);
        mySet.add(1313);
        mySet.add(13333);
        mySet.print();
//        mySet.add(20);

    }

}

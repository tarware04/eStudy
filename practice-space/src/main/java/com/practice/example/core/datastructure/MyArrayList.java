package com.practice.example.core.datastructure;

public class MyArrayList<T> {
    private T myarray[];
    private int index;

    public MyArrayList() {
        index = 0;
        myarray = (T[]) new Object[10];
    }

    public boolean add(T item) {
        myarray[index++] = item;
        return true;
    }

    public boolean addAll(T[] items) {
        int k = 0;
        for (int j = myarray.length + 1; j < items.length; j++) {
            myarray[j] = items[k];
            k = k+1;
        }
        return true;
    }

    public T remove(T item) {
        T itemRemoved = null;
        int k = 0;
        T nextItem = null;
        while (myarray.length > 0){
            if(myarray[k] == item){
                itemRemoved = myarray[k];
            }

            if (itemRemoved != null) {
                nextItem = myarray[k+1];
                myarray[k] = nextItem;
                k++;
            }

        }
        return itemRemoved;
    }

    public boolean contains(T item) {

        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

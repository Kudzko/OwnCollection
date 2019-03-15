package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.classes.exceptions.InvalidArgumentException;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;

import java.util.Iterator;

public class MyArrayList extends AbstractList implements OwnQueue {


    /**
     * Default capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    private static final Object [] DEFAULT_ARRAY = {};

    /**
     * The size of the MyArrayList (the number of elements it contains).
     */
    private int size;


    /**
     * The array buffer
     */
    Object[] elementData;



    public MyArrayList() {
        this.elementData = DEFAULT_ARRAY;
    }


    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param  size  the initial capacity of the list
     * @throws InvalidArgumentException if the specified initial capacity
     *         is negative
     */
    public MyArrayList(int size) {
        if (size >= 0){
            this.elementData = new Object[size];
        }else {
            throw new RuntimeException();
        }

    }


    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

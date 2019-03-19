package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.classes.exceptions.IllegalArgumentException;
import by.epam.javawebtraining.kudzko.task02.classes.exceptions.IndexOutOfBoundException;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnCollection;

import java.util.Arrays;
import java.util.Iterator;

public class OwnAbstractArrayList<E> implements OwnCollection<E> {

    /**
     * Default capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Default array.
     */
    private static final Object[] DEFAULT_ARRAY = {};

    /**
     * The size of the MyArray (the number of elements it contains).
     */
    private int size;

    /**
     * The array buffer
     */
    protected Object[] elementData;

    public OwnAbstractArrayList() {
        this.elementData = DEFAULT_ARRAY;
    }

    public OwnAbstractArrayList(int startCapacity) {
        if (startCapacity > 0) {
            this.elementData = new Object[startCapacity];
        } else if (startCapacity == 0) {
            this.elementData = DEFAULT_ARRAY;
        } else {
            throw new IllegalArgumentException("Illegal startCapacity: " +
                    startCapacity);
        }
    }


    private void grow(int minCapacity) {

        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + oldCapacity / 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        if ((newCapacity - Integer.MAX_VALUE) > 0) {
            throw new OutOfMemoryError();
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public boolean add(E e) {
        ensureDataCapacity(size + 1);
        elementData[size++] = e;
        return false;
    }

    private void ensureDataCapacity(int minCapacity) {

        if ((minCapacity - elementData.length) > 0) {
            if (elementData == DEFAULT_ARRAY) {
                minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
            }
            grow(minCapacity);
        }
    }

    @Override
    public E remove(int index) {

        checkRange(index);

        E oldValue = elementData(index);
        int copyLength = size - index-1;
        System.arraycopy(elementData, index+1,elementData,index,copyLength);

        elementData[--size] = null;

        return oldValue;
    }

    private void checkRange(int index){
        if ((index < 0) || (index >= size)){
            throw new IndexOutOfBoundException();
        }
    }

   E elementData(int index){
        return (E) elementData[index];
   }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

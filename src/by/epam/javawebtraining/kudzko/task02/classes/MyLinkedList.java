package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnStack;

import java.util.Iterator;

public class MyLinkedList<E> extends AbstractList implements OwnQueue,OwnStack {
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
    public Object push(Object item) {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;

public  class OwnArrayQueue<E> extends OwnAbstractArrayList<E> implements
        OwnQueue<E> {

    @Override
    public E remove() {
        return remove(0);
    }
}
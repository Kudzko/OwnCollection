package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnStack;

public class OwnArrayStack<E> extends OwnAbstractArrayList<E> implements
        OwnStack<E> {


    @Override
    public E push(E item) {
        add(item);
        return item;
    }

    @Override
    public E pop() {
        return remove(size() - 1);
    }


}

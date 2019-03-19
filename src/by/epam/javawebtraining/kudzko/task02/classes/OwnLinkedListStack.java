package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.classes.exceptions.NoElementsException;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnStack;

import java.util.Stack;

public class OwnLinkedListStack<E> extends OwnAbstractLinkedList<E>
        implements OwnStack <E>{


    @Override
    public E push(E item) {
        linkFirst(item);
        return item;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            throw new NoElementsException("Impossible pop any elements. " +
                    "LinkedList is empty.");
        }
        return unlinkFirst();
    }
}

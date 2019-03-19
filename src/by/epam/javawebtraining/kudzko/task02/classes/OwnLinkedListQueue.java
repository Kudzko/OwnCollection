package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.classes.exceptions.NoElementsException;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;

public class OwnLinkedListQueue<E> extends OwnAbstractLinkedList<E>
        implements OwnQueue<E> {

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoElementsException("Can not remove any elements from " +
                    "queue. List is empty");
        }
        return unlinkFirst();
    }
}

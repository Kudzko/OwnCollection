package by.epam.javawebtraining.kudzko.task02.interfaces;

public interface OwnStack<E> extends OwnCollectoin<E> {

    public E push(E item);

    public E pop();
}

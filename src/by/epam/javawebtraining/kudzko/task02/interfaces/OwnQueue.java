package by.epam.javawebtraining.kudzko.task02.interfaces;

public interface OwnQueue<E> extends OwnCollection<E> {

    boolean add(E e);

    E remove();
}

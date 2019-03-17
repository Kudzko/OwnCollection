package by.epam.javawebtraining.kudzko.task02.interfaces;

import java.util.*;

public interface OwnCollectoin<E> extends Iterable<E> {

  boolean add(E e);

  E remove(int index);

  int size();

  boolean isEmpty();

}



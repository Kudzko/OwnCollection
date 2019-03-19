package by.epam.javawebtraining.kudzko.task02.classes;

import by.epam.javawebtraining.kudzko.task02.interfaces.OwnCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class OwnAbstractLinkedList<E> implements OwnCollection<E> {

    int size = 0;
    Node<E> first;
    Node<E> last;

    protected void linkFirst(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, e, f);
        if (f != null) {
            f.prev = newNode;
        } else {
            last = newNode;
        }
        first = newNode;
        size++;
    }

    protected void linkLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(last, e, null);
        if (l != null) {
            l.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
    }


    protected E unlinkFirst() {
        Node<E> f = first;
        Node<E> sec = first.next;
        sec.prev = null;
        first = sec;
        f.next = null;
        size--;
        return f.item;
    }

    protected E unlinkLast() {
        Node<E> l = last;
        Node<E> preLast = last.prev;
        preLast.next = null;
        last = preLast;
        l.prev = null;
        size--;
        return l.item;
    }

    protected E unlink(int index) {
        Node<E> unlinkingNode = getNodeByIndex(index);
        return unlinkNode(unlinkingNode);
    }

    private E unlinkNode(Node<E> element) {
        E item = element.item;
        Node<E> previous = element.prev;
        Node<E> next = element.next;

        if (next != null) {
            next.prev = previous;
            element.next = null;
        } else {
            last = previous;
        }

        if (previous != null) {
            previous.next = next;
            element.prev = null;
        } else {
            first = next;
        }
        element.item = null;
        size--;

        return item;
    }

    private void checkIndex(int index) {
        if (!isIndexInRange(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isIndexInRange(int index) {
        return (index >= 0) && (index < size);
    }

    private Node<E> getNodeByIndex(int index) {

        checkIndex(index);
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }


    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public E remove(int index) {
        return unlink(index);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    private static class Node<E> {
        E item;
        OwnAbstractLinkedList.Node<E> next;
        OwnAbstractLinkedList.Node<E> prev;

        Node(OwnAbstractLinkedList.Node<E> prev, E element, OwnAbstractLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

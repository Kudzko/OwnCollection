package by.epam.javawebtraining.kudzko.task02.controller;


import by.epam.javawebtraining.kudzko.task02.classes.OwnArrayQueue;
import by.epam.javawebtraining.kudzko.task02.classes.OwnArrayStack;
import by.epam.javawebtraining.kudzko.task02.classes.OwnLinkedListQueue;
import by.epam.javawebtraining.kudzko.task02.classes.OwnLinkedListStack;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnStack;

import java.util.LinkedList;
import java.util.Queue;

public class SampleUsingOwnCollections {
    public static void main(String[] args) {

        OwnQueue<String> myQueue1 = new OwnLinkedListQueue();
        System.out.println(myQueue1.isEmpty());
        myQueue1.add(new String("test1"));
        myQueue1.add(new String("test2"));
        myQueue1.add(new String("test3"));
        System.out.println(myQueue1.remove().toString());
        System.out.println(myQueue1.remove());
        System.out.println(myQueue1.remove());
        System.out.println(myQueue1.isEmpty());

        OwnQueue<String> myQueue2 = new OwnArrayQueue<>();
        System.out.println(myQueue2.isEmpty());
        myQueue2.add(new String("testI"));
        myQueue2.add(new String("testII"));
        myQueue2.add(new String("testIII"));
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.remove());
        System.out.println(myQueue2.isEmpty());

        OwnStack<String> myStack1 = new OwnLinkedListStack<>();
        System.out.println(myStack1.isEmpty());
        myStack1.push(new String("stackItem1"));
        myStack1.push(new String("stackItem2"));
        myStack1.push(new String("stackItem3"));
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());

        OwnStack<String> myStack2 = new OwnArrayStack<>();
        System.out.println(myStack2.isEmpty());
        myStack2.push(new String("stackItemI"));
        myStack2.push(new String("stackItemII"));
        myStack2.push(new String("stackItemIII"));
        System.out.println(myStack2.pop());
        System.out.println(myStack2.pop());
        System.out.println(myStack2.pop());

    }

}

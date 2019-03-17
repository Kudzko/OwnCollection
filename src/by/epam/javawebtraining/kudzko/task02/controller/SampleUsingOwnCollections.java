package by.epam.javawebtraining.kudzko.task02.controller;

import by.epam.javawebtraining.kudzko.task02.classes.OwnAbstractArrayList;
import by.epam.javawebtraining.kudzko.task02.classes.OwnArrayQueue;
import by.epam.javawebtraining.kudzko.task02.classes.OwnArrayStack;


public class SampleUsingOwnCollections {
    public static void main(String[] args) {

        OwnArrayQueue ownArrayStack = new
                OwnArrayQueue();
        System.out.println(ownArrayStack.isEmpty());
        ownArrayStack.add(new String("test1"));
        ownArrayStack.add(new String("test2"));

        System.out.println(ownArrayStack.remove());
        System.out.println(ownArrayStack.remove());

    }
}

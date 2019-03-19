package by.epam.javawebtraining.kudzko.task02.controller;


import by.epam.javawebtraining.kudzko.task02.classes.OwnLinkedListQueue;
import by.epam.javawebtraining.kudzko.task02.interfaces.OwnQueue;

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


    }

}

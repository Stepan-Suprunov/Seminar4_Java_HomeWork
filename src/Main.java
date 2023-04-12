// Домашнее задание к семинару №4 JAVA API Супрунов Степан

import tasks.QueueMethods;
import tasks.ReverseList;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> thisLinkedList = new LinkedList<>();
        thisLinkedList.add("мама");
        thisLinkedList.add("мыла");
        thisLinkedList.add("раму");
        System.out.println(thisLinkedList);
        System.out.println(ReverseList.reverseList(thisLinkedList));
        System.out.println();
        Queue<String> thisQueue = new LinkedList<>();
        thisQueue.add("ехали");
        thisQueue.add("медведи");
        thisQueue.add("на");
        System.out.println(thisQueue);
        String myString = "велосипеде";
        QueueMethods.enqueue(thisQueue, myString);
        System.out.println(thisQueue);
        QueueMethods.first(thisQueue);
        System.out.println(thisQueue);
        QueueMethods.dequeue(thisQueue);
        System.out.println(thisQueue);
    }
}
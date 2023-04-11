// Домашнее задание к семинару №4 JAVA API Супрунов Степан

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
        thisQueue.add("велосипеде");
        System.out.println("Добавлениие элементов в конец очереди " + thisQueue);
        System.out.println("Возвращает первый элемент из очереди, не удаляя его " + "[" + thisQueue.peek() + "]");
        System.out.println(thisQueue);
        System.out.println("Возвращает первый элемент из очереди, и удаляет его " + "[" + thisQueue.poll() + "]");
        System.out.println(thisQueue);
    }
}
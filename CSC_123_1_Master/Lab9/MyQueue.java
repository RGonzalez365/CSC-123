// Title: Lab 9
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/17/2023

import java.io.Serializable;
import java.util.LinkedList;

public class MyQueue implements Serializable {
    private LinkedList<Object> queue;
    public MyQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(Object o) {
        queue.addLast(o);
    }
    public Object dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }
    public int size() {
        return queue.size();
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("hello");
        queue.enqueue("world");
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}

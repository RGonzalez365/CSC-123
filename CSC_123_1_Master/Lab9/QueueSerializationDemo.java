// Title: Lab 9
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/17/2023

import java.io.*;

public class QueueSerializationDemo {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("hello");
        queue.enqueue("world");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("queue.ser"))) {
            out.writeObject(queue);
            System.out.println("Queue serialized successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("queue.ser"))) {
            MyQueue deserializedQueue = (MyQueue) in.readObject();
            System.out.println("Queue deserialized successfully!");
            System.out.println("Queue size: " + deserializedQueue.size());
            Object element;
            while ((element = deserializedQueue.dequeue()) != null) {
                System.out.println(element);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

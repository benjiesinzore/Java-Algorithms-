package org.example.control_and_data_struc;

import java.util.*;

public class DataStructures {

    public static void main(String[] args) {
        new DataStructures().arrays();
    }


    /**
    * Arrays are fixed-size data structures that hold elements of the same type.
    * */
    public void arrays() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }


    /**
    * ArrayList is a resizable array implementation of the List interface.
    * */
    public void arrayList() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }


    /**
     * LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
     * */
    public void linkedList() {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


    /**
     * HashMap is a hash table-based implementation of the Map interface.
     * It allows for the storage of key-value pairs.
     * */
    public void hashMap() {
        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 25);
        ageMap.put("BS", 35);

        for (String name : ageMap.keySet()) {
            System.out.println(name + ": " + ageMap.get(name));
        }
    }


    /**
     * HashSet is a hash table-based implementation of the Set interface. It does not allow duplicate elements.
     * */
    public void hashSet() {
        HashSet<String> uniqueNames = new HashSet<>();

        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice"); // duplicate element, won't be added

        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }


    /**
     * Stack is a last-in-first-out (LIFO) data structure. Java provides a Stack class that extends Vector.
     * */
    public void stack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        int num = 1;
        while (!stack.isEmpty()) {
            System.out.println(num + " : " + stack.pop());
            num++;
        }
    }


    /**
     * Queue is a first-in-first-out (FIFO) data structure. Java provides the Queue interface, and it can be implemented using classes like LinkedList.
     * */
    public void queue() {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


    /**
     * PriorityQueue is a queue where elements are ordered based on their natural ordering or by a specified comparator.
     * */
    public void priorityQueue() {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Benjamin");
        pq.add("Sinzore");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }


    /**
     * TreeMap is a Red-Black tree-based implementation of the Map interface. It orders its keys based on their natural ordering or a specified comparator.
     * */
    public void treeMap() {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);

        for (String name : treeMap.keySet()) {
            System.out.println(name + ": " + treeMap.get(name));
        }
    }


    /**
     * TreeSet is a NavigableSet implementation based on a TreeMap. It stores elements in a sorted order.
     * */
    public void treeSet() {

        TreeSet<String> sortedNames = new TreeSet<>();

        sortedNames.add("Charlie");
        sortedNames.add("Alice");
        sortedNames.add("Bob");

        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}

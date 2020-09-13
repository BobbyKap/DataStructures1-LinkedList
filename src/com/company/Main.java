package com.company;

public class Main{
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //Add nodes to the list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();

        System.out.println(" ");
        System.out.println("Test add(3,4)");
        list.add(3, 4);
        list.display();

        System.out.println(" ");
        System.out.println("Test addFirst(0)");
        list.addFirst(0);
        list.display();

        System.out.println(" ");
        System.out.println("Test addLast(5)");
        list.addLast("5");
        list.display();

        System.out.println(" ");
        System.out.println(list.contains(2) + ": Test contains(2)");
        System.out.println(list.get(1).data + ": Test get(1)");
        System.out.println(list.size() + ": Test size");
        System.out.println(" ");

        System.out.println("Removing");
        System.out.println(" ");
        System.out.println("Test poll");
        list.poll();
        list.display();

        System.out.println(" ");
        System.out.println("Test pollLast");
        list.pollLast();
        list.display();

        System.out.println(" ");
        System.out.println("Test removeIdx(2)");
        list.removeIdx(2);
        list.display();

        System.out.println(" ");
        System.out.println("Test removeObj(1)");
        list.removeObj(1);
        list.display();

        System.out.println(" ");
        System.out.println("Adding Numbers Back");
        list.add(0, 1);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);
        list.add(5, 6);
        list.add(6, 7);
        list.display();

        System.out.println(" ");
        System.out.println("Test indexOf(5)");
        list.indexOf(5);
        list.display();

        System.out.println(" ");
        System.out.println("Test set(3, 33) (Doing twice for lastIndexOf)");
        list.set(3, 33);
        list.set(5, 33);
        list.display();

        System.out.println(" ");
        System.out.println("Test lastIndexOf(33) (Should be 5)");
        System.out.println(list.lastIndexOf(33));
        list.display();

        System.out.println(" ");
        System.out.println("Test getFirst");
        System.out.println(list.getFirst().data);
        list.display();

        System.out.println(" ");
        System.out.println("Test getLast");
        System.out.println(list.getLast().data);
        list.display();

        System.out.println(" ");
        System.out.println("Test clear");
        list.clear();
        list.display();


    }
}

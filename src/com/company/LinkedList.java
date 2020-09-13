package com.company;

import static java.lang.Integer.signum;

public class LinkedList {
    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(Object data) {
        Node newNode = new Node(data);
        Node newNodeNext = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Add Functions
    public void add(int index, Object data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else if(index == 0){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node foundNode = get(index - 1);
            if(foundNode == null){
                System.out.println("Index out of range");
                return;
            }
            else{
                newNode.next = foundNode.next;
                foundNode.next = newNode;
            }
        }
    }

    public void addFirst(Object data){
        add(0, data);
    }

    public void addLast(Object data){
        Node newNode = new Node(data);
        tail.next = newNode;
    }

    //Get Functions
    public Node get(int index) {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if(index == 0){
            return head;
        }
        for(int i = 0; i < index; i++){
            if (current.next == null){
                return null;
            }
            else{
                current = current.next;
            }
        }
        return current;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        return get(size() - 1);
    }

    //Remove Functions
    public Object poll(){
        head = head.next;
        return head;
    }

    public Object pollLast(){
        return removeIdx(size() - 1);
    }

    public Object removeIdx(int index) {
        if(index == 0){
            return poll();
        }
        Node current = get(index);
        Node prior = get(index - 1);
        prior.next = current.next;
        return current;
    }

    public Object removeObj(Object data) {
        int idx = indexOf(data);
        if(idx == -1) {
            return null;
        }
        return removeIdx(idx);
    }

    //Misc
    public Object set(int index, Object data){
        Node current = get(index);
        if(current != null){
            current.data = data;
        }
        return current;
    }

    public int indexOf(Object data){
        Node current = new Node(data);
        int count = 0;
        while(current != null){
            if(current.data == data){
                return count;
            }
            count++;
        }
        return -1;
    }

    public int lastIndexOf(Object data){
        for(int i = size() - 1; i >= 0; i--){
            Node current = get(i);
            if(current.data == data){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object data){
        return(indexOf(data) != -1);
    }

    public void clear(){
        head = null;
        tail = null;
    }

    public int size(){
        Node current = head;
        int count = 1;
        if(head == null){
            return 0;
        }
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("List:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
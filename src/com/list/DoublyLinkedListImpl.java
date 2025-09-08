package com.list;

public class DoublyLinkedListImpl {
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public void insertAtBeginning(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void traverseForward() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void traverseBackward() {
        DoublyLinkedListNode current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        // Write your code here
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        while(current.next != null && current.data < data) {
            current = current.next;
        }

        if(current.next == null && current.data < data) {
            current.next = newNode;
            newNode.prev = current;
        } else {
            tail = current.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = current;
            current.prev = newNode;
        }

        return llist;
    }

    public static void main(String[] args) {
        DoublyLinkedListImpl doublyLinkedListImpl = new DoublyLinkedListImpl();
        doublyLinkedListImpl.insertAtEnd(1);
        doublyLinkedListImpl.insertAtEnd(3);
        doublyLinkedListImpl.insertAtEnd(4);
        doublyLinkedListImpl.insertAtEnd(10);

        doublyLinkedListImpl.traverseForward();
        System.out.println("\n--------------");
        //doublyLinkedListImpl.traverseBackward();

        DoublyLinkedListNode newList = doublyLinkedListImpl.sortedInsert(doublyLinkedListImpl.head, 5);

        System.out.println(newList);
    }
}

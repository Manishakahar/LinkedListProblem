package com.blz.linkedlist;

public class Operation {
    public static void createSimpleLikedList() {
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        firstNode .next = secondNode;
        secondNode.next = thirdNode;
        Node head = firstNode;
        Node tail = thirdNode;

        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    public static void addElementInStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
}
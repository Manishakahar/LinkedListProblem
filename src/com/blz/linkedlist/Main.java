package com.blz.linkedlist;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to create simple linked list");
        System.out.println("Enter 2 add element in start linked list");
        System.out.println("Enter 3 add element in end");
        switch (sc.nextInt()){
            case 1:
                Operation.createSimpleLikedList();
                break;
            case 2:
                Operation.addElementInStart();
                break;
            case 3:
                Operation.addElementAtEnd();
                break;
            default:
                System.out.println("please enter correct option");

        }
    }
}

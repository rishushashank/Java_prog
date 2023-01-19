package com.company;

import static java.lang.System.exit;

public class ll {
   // Node head;
    private int size;
    ll(){
        size = 0;
    }
    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
static Node head = null;
    public static void add_first(String data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;

    }
    public static void add_last(String data){
        Node node = new Node(data);
        node.next = null;
        node.data = data;
        if (head == null){
            head = node;
            return;
        }
        Node itr = head;
       while(itr.next != null){
           itr = itr.next;
       }
       itr.next = node;
    }

    public static void printlist(){
        if (head == null){
            System.out.println("empty list");
            return;
        }
        Node itr = head;
        while(itr != null){
            System.out.println(itr.data);
            itr = itr.next;
        }
    }




    public static void delete(String data){
        if (head == null){
            System.out.println("empty list");
            return;
        }

        Node itr = head;
        if( itr.data == data){
            head = itr.next;
        }
        else {
            for (itr = head; itr.next != null; itr = itr.next) {
                if (itr.next.data == data) {
                    itr.next = itr.next.next;
                    break;
                }
            }
        }

    }
    public static int size(){
        int c= 0;
        Node itr = head;
        while(itr != null){
            c++;
            itr = itr.next;
        }
        return c;
    }

    public static void main(String [] args){
        ll list = new ll();
        list.add_first("rishu");
        ll.add_first("rshu");
        ll.add_last("gohil");
        printlist();
        ll.delete("gohil");
        printlist();
        System.out.println(ll.size());
    }
}

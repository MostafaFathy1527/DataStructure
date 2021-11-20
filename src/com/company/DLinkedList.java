package com.company;

public class DLinkedList {
    static DNode Head=null;
    static DNode Tail=null;
    public static  int   size=0;


    static DNode CreateNode(Integer Data){
        DNode NewNode= new DNode();
        if(NewNode!=null){
            NewNode.Data=Data;
            NewNode.Prev=null;
            NewNode.Next=null;
        }
        size++;
        return NewNode;
    }

    public static DNode SearchNode(Integer Data){
        DNode NewNode;
        NewNode=Head;
        while(NewNode!=null&&NewNode.Data!=Data){
            NewNode=NewNode.Next;
        }
        return NewNode;
    }

    public static void PrintList () {
        DNode current = Head;
        if(Head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.Data + " ");
            current = current.Next;
        }
    }

    public static void AddNode(int Data) {
        DNode newNode = CreateNode ( Data );

        if(Head == null) {
            Head = Tail = newNode;
            Head.Prev = null;
            Tail.Next = null;
        }
        else {
            Tail.Next = newNode;
            newNode.Prev = Tail;
            Tail = newNode;
            Tail.Next = null;
        }

    }

    public static void Push(int data) {
        DNode newNode = CreateNode ( data );
        newNode.Data = data;
        newNode.Next = Head;
        newNode.Prev=null;
        if(Head!=null)
            Head.Prev=newNode;
        Head = newNode;
        if(Tail==null)
            Tail=newNode;
        size++;
    }

    public static void DeleteFirst() {

        if (size == 0)
            throw new RuntimeException("Doubly linked list is already empty");
        DNode temp = Head;
        Head = Head.Next;
        Head.Prev = null;
        size--;

    }

    public static void DeleteLast() {

        DNode temp = Tail;
        Tail = Tail.Prev;
        Tail.Next=null;
        size--;
    }

}

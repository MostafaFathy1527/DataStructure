package com.company;


import java.util.*;


public class Main {

    public static void main(String[] args)   {
        LinkedList list = new LinkedList();
        list.Append (1);
        list.Append (2);
        list.Append (3);
        list.InsertAfter (3,4);
        list.PushAt (5,4);
        list.Append (6);
        LinkedList list2 = new LinkedList();
        list2.Append (7);
        list2.Append (8);
        list2.Append (9);
        list2.Append (10);
        list2.Append (11);
        list2.Append (12);
        list.AddAll ( list2 );
        list.PrintList ();
    }



}



package com.company;


import java.util.*;


public class Main {

    public static void main(String[] args)   {
        LinkedList list = new LinkedList();
        list.Append (1);
        list.Append (2);
        list.Append (3);
        list.Append (4);
        list.Append (5);
        list.Append (6);
        list.Append (7);

        list.PrintList ();
        list.reverse ( list.Head );
        list.PrintList();
    }


}



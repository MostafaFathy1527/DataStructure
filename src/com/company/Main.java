package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append ( 1 );//1
        list.append ( 2 );//1 2
        list.Push ( 3 );//3 1 2
        list.InsertAfter ( list.Head , 2 );//3 2 1 2
        list.Push ( 3 );//3 3 2 1 2
        list.PushAt ( 5,5 );//3 3 2 1 2 5
        list.DeleteWithData(5);
        list.DeleteAtIndex(0);
        list.DeleteList();
        list.PrintList ();

    }


}

/*
        int[] arr = new int[8];
        System.out.println("Elements are not of original array");
        for (int i = 0;i< arr.length; i++) {


        arr[i]=input.nextInt();

        }

        int [] fr = new int [arr.length];
        int visited = -1;

        for(int i = 0; i < arr.length; i++){
        int count = 1;
        for(int j = i+1; j < arr.length; j++){
        if(arr[i] == arr[j]){
        count++;
        fr[j] = visited;
        }
        }
        if(fr[i] != visited)
        fr[i] = count;
        }

        for(int i = 0; i < fr.length; i++){
        if(fr[i] != visited)
        System.out.println(arr[i] + " occurs "+ fr[i]+" times ");
        }
        */

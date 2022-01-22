package com.company;

public
class Stack {
    private static StackNode tail;

    public static boolean Push ( int data ){
        boolean retval = false;
        StackNode node=new StackNode(data);
        if(node!=null){
            if(tail==null){
                tail=node;
            }
            else{
                node.prev=tail;
                tail=node;
            }
            retval=true;
        }
        return retval;
    }
    public static int pop(){
        int retval;
        retval=tail.data;
        if(tail!=null){
            tail=tail.prev;
        }
        return retval;
    }
    public void reverse1()
    {
        StackNode prev, cur, temp;
        cur = prev = this.tail;
        cur = cur.prev;
        prev.prev = null;
        while (cur != null) {

            temp = cur.prev;
            cur.prev = prev;
            prev = cur;
            cur = temp;
        }
        this.tail = prev;
    }
    public void display()
    {
        StackNode s = this.tail;
        while (s != null) {
            System.out.print(s.data + " ");
            s = s.prev;
        }
        System.out.println();
    }

}


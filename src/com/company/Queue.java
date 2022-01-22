package com.company;

public
class Queue {
    QueueNode front;
    QueueNode rear;
    int length;
    public boolean isEmpty(){
        return length ==0;
    }
    public void enqueue(QueueNode node){
        if(length==0){
            front=node;
        }
        else{
            rear.next=node;
        }
        length++;
        rear=node;
    }
    public void enqueue(int data){
        QueueNode node=new QueueNode(data);
        if(length==0){
            front=node;
        }
        else{
            rear.next=node;
        }
        length++;
        rear=node;
    }
    public void print(QueueNode temp){
        if(temp==null){
            return;
        }

        else {
            System.out.println ( temp.data );
            print (temp.next );
        }
    }
    public int dequeue(){
        if(isEmpty()){
            return -999;
        }
        else{
            int result=front.data;
            front=front.next;
            if (front==null){
                rear=null;
            }
            length--;
            return result;
        }
    }
}
package com.company;

public
class LinkedList {
    public Node Head = null;
    int size = 0;

    public
    Node CreateDummyNode ( Integer Data ) {
        Node NewNode = new Node ( );
        NewNode.Data = Data;
        NewNode.Next = null;
        size++;
        return NewNode;
    }

    public
    void Push ( Integer Data ) {
        Node NewNode = CreateDummyNode ( Data );
        NewNode.Next = Head;
        Head         = NewNode;
    }

    public
    void Append ( Integer Data ) {

        Node newNode = CreateDummyNode ( Data );
        Node temp=Head;
        if(Head == null){
            Push(Data);
        }
        else{
            while(temp.Next!=null){
                temp=temp.Next;
            }
            temp.Next=newNode;
        }
    }

    public
    void InsertAfter ( int prev_data , int Data ) {
         Node newNode= CreateDummyNode(Data);
         Node temp=Head;
         if(Head == null){
         }
         else{
             while(temp.Data!=prev_data){
                 temp=temp.Next;
             }
             newNode.Next=temp.Next;
             temp.Next=newNode;
         }
    }

    public
    void PushAt ( int Data , int position ) {
        Node newNode = CreateDummyNode ( Data );
        if(position==0){
            newNode.Next=Head.Next;
            Head=newNode;
        }
        else {
            if (position>size){
                System.out.println ("position not valid" );
            }
            else{
                Node temp=Head;
                for(int  i =0;i<position-1;i++){
                    temp=temp.Next;
                }
                newNode.Next=temp.Next;
                temp.Next    = newNode;
            }
        }
    }

    public
    Node SearchNode ( int Data ) {
        Node Target = CreateDummyNode ( Data );
        Node Temp   = Head;
        while ( Temp.Next != null && Temp.Data != Data ) {
            Temp = Temp.Next;
        }
        if ( Temp.Data == Data ) {


            return Temp;
        }
        else
            return null;
    }

    public
    void DeleteWithData ( int key ) {
        Node temp = Head, prev = null;

        if ( temp != null && temp.Data == key ) {
            Head = temp.Next;
            size--;
            return;
        }

        while ( temp != null && temp.Data != key ) {
            prev = temp;
            temp = temp.Next;
        }

        if ( temp == null )
            return;
        else {
            prev.Next = temp.Next;
            size--;
        }
    }

    public
    void DeleteAtIndex ( int Index ) {
        if ( Head == null )
            return;

        Node temp = Head;


        if ( Index == 0 ) {
            Head = temp.Next;
            return;
        }

        for ( int i = 0 ; temp != null && i < Index - 1 ; i++ )
              temp = temp.Next;

        if ( temp == null || temp.Next == null )
            return;


        temp.Next = temp.Next.Next;
        size--;
    }

    public
    void DeleteList ( ) {
        Head = null;
        size = 0;
    }

    public
    void PrintList ( ) {
        Node node = Head;
        while ( node != null ) {
            System.out.print ( node.Data + " " );
            node = node.Next;
        }
        System.out.println ( );
    }

    public
    void printNthFromLast ( int n ) {
        int  len  = 0;
        Node temp = Head;

        while ( temp != null ) {
            temp = temp.Next;
            len++;
        }

        if ( len < n )
            return;

        temp = Head;

        for ( int i = 0 ; i < len - n - 1 ; i++ )
              temp = temp.Next;

        System.out.println ( temp.Data );
    }

    public
    void printNth ( int index ) {
        Node current = Head;
        int  count   = 0;
        while ( current != null ) {
            if ( count == index )
                System.out.println ( current.Data );
            count++;
            current = current.Next;
        }

    }

    public
    int GetCount ( ) {
        Node temp  = Head;
        int  count = 0;
        while ( temp != null ) {
            count++;
            temp = temp.Next;
        }
        return count;
    }

    public
    void AddAll ( LinkedList list ) {
        Node Temp = Head;
        while ( Temp.Next != null ) {
            Temp = Temp.Next;
        }
        Temp.Next = list.Head;
    }

    void printReverse ( Node head ) {
        if ( head == null ) return;
        else {
            printReverse ( head.Next );
            System.out.print ( head.Data + " " );

        }

    }

    public
    Node reverseIterative ( Node head ) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while ( curr != null ) {
            next      = curr.Next;
            curr.Next = prev;
            prev      = curr;
            curr      = next;
        }
        return prev;

    }

    public
    Node reverse ( Node head ) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while ( curr != null ) {
            next      = curr.Next;
            curr.Next = prev;
            prev      = curr;
            curr      = next;
        }
        return prev;

    }
}


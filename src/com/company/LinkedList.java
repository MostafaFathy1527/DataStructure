package com.company;

public class LinkedList {
    public Node Head = null;
    int size = 0;

    public Node CreateDummyNode ( Integer Data ) {
        Node NewNode = new Node ( );
        NewNode.Data = Data;
        NewNode.Next = null;
        size++;
        return NewNode;
    }

    public void Push ( Integer Data ) {
        Node NewNode;
        NewNode      = CreateDummyNode ( Data );
        NewNode.Next = Head;
        Head         = NewNode;
    }

    public void Append ( Integer Data ) {

        Node new_node = CreateDummyNode ( Data );


        if ( Head == null ) {
            Head = CreateDummyNode ( Data );
            return;
        }


        new_node.Next = null;

        Node last = Head;
        while ( last.Next != null )
            last = last.Next;

        last.Next = new_node;
        return;
    }

    public void InsertAfter ( Node prev_node , int Data ) {

        if ( prev_node == null ) {
            System.out.println ( "The given previous node cannot be null" );
            return;
        }


        Node NewNode;

        NewNode = CreateDummyNode ( Data );

        NewNode.Next = prev_node.Next;

        prev_node.Next = NewNode;
    }

    public void PushAt ( int Data , int position ) {
        Node newNode = CreateDummyNode ( Data );
        if ( position < 0 ) {
            System.out.print ( "\nposition should be >= 0." );
        }
        else if ( position == 0 ) {
            newNode.Next = Head;
            Head         = newNode;
        }
        else {

            Node temp;
            temp = Head;
            for ( int i = 0 ; i < position - 1 ; i++ ) {
                if ( temp != null ) {
                    temp = temp.Next;
                }
            }

            if ( temp != null ) {
                newNode.Next = temp.Next;
                temp.Next    = newNode;
            }
            else {
                System.out.print ( "\nThe previous node is null." );
            }
        }
    }

    public Node SearchNode ( Integer Data ) {
        Node Target = Head;
        while ( ! Target.Data.equals ( Data ) && Target.Next != null ) {
            Target = Target.Next;
        }
        if ( Target.Data.equals ( Data ) )
            return Target;
        else
            return null;
    }

    public void DeleteWithData ( int key ) {
        Node temp = Head, prev = null;

        if ( temp != null && temp.Data == key ) {
            Head = temp.Next;
            return;
        }

        while ( temp != null && temp.Data != key ) {
            prev = temp;
            temp = temp.Next;
        }

        if ( temp == null )
            return;

        prev.Next = temp.Next;
        size--;
    }

    public void DeleteAtIndex ( int Index ) {
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

    public void DeleteList ( ) {
        Head = null;
        size = 0;
    }

    public void PrintList ( ) {
        Node node = Head;
        while ( node != null ) {
            System.out.print ( node.Data + " " );
            node = node.Next;
        }
        System.out.println ( );
    }

    public void printNthFromLast ( int n ) {
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


    public void printNth ( int index ) {
        Node current = Head;
        int  count   = 0;
        while ( current != null ) {
            if ( count == index )
                System.out.println ( current.Data );
            count++;
            current = current.Next;
        }


    }


    public int GetCount ( ) {
        Node temp  = Head;
        int  count = 0;
        while ( temp != null ) {
            count++;
            temp = temp.Next;
        }
        return count;
    }


}


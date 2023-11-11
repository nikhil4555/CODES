package LINKED_LIST;

// package LINKED_LIST;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class ln{
    Node head;
    void display()
    {
        Node curr = head;
        while(curr.next!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    void add(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node curr = head;
            while(curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next=newnode;
        }
    }
    void delete()
    {
        Node curr  = head;
        if(head==null)
        {
            //no element present so cant delete anything
        }
        else if(head.next==null)
        {
            head=null;
        }
        else if(head.next!=null)//checks if the nodes are present are not
        {
            while(curr.next.next!=null)
            {
                curr = curr.next;
            }
            curr.next=null;//it will delete the last node by making it to null
        }
    }
}
public class delete_last {
    public static void main(String[] args) {
        ln ll = new ln();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.display();
        ll.delete();
        ll.display();
    }
}


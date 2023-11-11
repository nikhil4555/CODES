package LINKED_LIST;
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
class linkedlist
{
    Node head;
    void display()
    {
        Node  curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    void add(int d)
    {
        Node newnode = new Node(d);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node curr=head;
            while(curr!=null)
            {
                curr = curr.next;
            }
        }
    }
    void delete()
    {
        Node curr;
        if(head==null)
        {

        }
        else{
            
        }
    }
}

public class del_last {
    public static void main(String[] args) {
        
    }
}

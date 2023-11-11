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
class ll
{
    Node head;
    void display()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    void front(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }


}

public class add_front {
    public static void main(String[] args) {
        ll nkl=new ll();
        nkl.front(45);
        nkl.front(58);
        nkl.front(99);
        nkl.display();
    }
}

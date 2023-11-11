package LINKED_LIST;

class Node
{
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LN
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
            while(curr.next!=null)
            {
                curr = curr.next;
            }
            curr.next=newnode;
        }
    }
    void delete()
    {
        if(head==null)
        {

        }
        else if(head.next==null)
        {
            head=null;
        }
        else if(head.next!=null)
        {
            Node curr = head;
            head=head.next;
            curr.next=null;
        }
    }

}
public class delete_frst {
    public static void main(String[] args) {
        LN ll = new LN();
        ll.add(10);
        ll.add(20);   
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.display();
        ll.delete();
        System.out.println("");
        ll.display();
    }
}

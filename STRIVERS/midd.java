package STRIVERS;
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
class Linkedlist
{
    Node head;
    void dispaly()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    void add(int data)
    {
        Node newnode = new Node(data);
        Node curr=head;
        if(head==null)
        {
            head=newnode;
        }
        else{
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }
    public int middlen()
    {
        int count =0;
        Node curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<count/2;i++)
        {
            curr=curr.next;
        }
        return curr.data;
    }
}
public class midd{
    public static void main(String[] args) {
        
        Linkedlist ll = new Linkedlist();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.dispaly();
        
        int middle = ll.middlen();
        System.out.println("the middle node is"+middle);
    }
}

package LINKED_LIST;
class Node
{
    Node next;
    int data;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LIN
{
    Node head;
    void display(){
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
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            Node curr = head;
            while(curr.next!=null)
            {
                curr=curr.next;
            } 
            curr.next=newnode;
        }
    }
    void add_first(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
    void add(int index,int element) throws IndexOutOfBoundsException
    {
       try
       {

           if(index==0)
           {
               add_first(element);
            }
            else
            {
                Node newnnode = new Node(element);
                int count =0;
                Node curr= head;
                while(count<index-1)
                {
                    curr=curr.next;
                    count++;
                }
                newnnode.next=curr.next;
                curr.next=newnnode;
                
            }
        }
        catch(NullPointerException e)
        {
            throw new IndexOutOfBoundsException();
        }
        }
    }
public class add_index {
    public static void main(String[] args) {
        LIN ll = new LIN();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(3,45);
        ll.add(0,58);
        // ll.add(10,55);
        ll.display();
    }
}

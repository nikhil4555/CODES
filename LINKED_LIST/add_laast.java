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
        Node curr = head;
        while (curr!=null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    void add(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            Node curr = head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next = temp;
        }
    }

}

public class add_laast {
    public static void main(String[] args) {
        // Node node = new Node(5);
        linkedlist ll = new linkedlist();
        
        ll.add(10);
        ll.add(55);
        ll.add(25);
        ll.add(98);
        ll.display();
        
    }
}

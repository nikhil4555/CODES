package STRIVERS;
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
class linkedlist
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
    void add(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
        }
        else{
            Node curr = head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=temp;
        }
    }
    void delete(int val)
    {
        Node curr=head;
        if(head==null)
        return ;
        while(curr.data!=val)//traversing all through to delete the required node
        {
            curr=curr.next;
        }
        curr.data=head.next.data; //after finding it we are replacing the value with the next data as we cannot use head;
        head.next=head.next.next;//now we change the next value to the next.next to delete that existing value;
        // return ;
    }
}
public class del_withouthead {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);
         
        ll.display();
        System.out.println();

        ll.delete(2);

        ll.display();
    }
}

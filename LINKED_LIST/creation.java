package LINKED_LIST;
class Node
{
    int data;
    Node next; //variable i.e. reffering to the  data type of Node
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LINKED_LIST{
    Node head;//creating a reference variable for head
    Node curr;
    
    void Display()
    {
        curr=head; //vv.imp as wee should assign the temporary varible to the curr so that we ecan display the values
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


}
public class creation {
    public static void main(String[] args) {
        
        LINKED_LIST ll = new LINKED_LIST();

        Node l1 = new Node(10);
        Node l2 = new Node(20);
        Node l3 = new Node(30);
        Node l4 = new Node(40);
        Node l5 = new Node(50);
        
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ll.head = l1;
        ll.Display();


    }
}
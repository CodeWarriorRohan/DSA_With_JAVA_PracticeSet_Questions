
package LinkedList_programs;
import java.util.Scanner;
public class LinkedList_pr5_Circular_Insertion
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation()
    {
        int data, n, m, ind;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();

            Node new_node =  new Node(data);
            if (head==null)
            {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }else {
                System.out.println("Choose any one location for previously entered element");
                System.out.println("Enter 1 to insert the element at the beginning");
                System.out.println("Enter 2 to insert the element at the end");
                System.out.println("Enter 3 to insert the element at the specific location");
                m = sc.nextInt();
                switch (m)
                {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;

                    case 2:
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;

                    case 3:
                        System.out.println("Enter the index no. element to be inserted");
                        ind = sc.nextInt();
                        Node temp1 = head;
                        for (int i=0; i<ind-1; i++)
                        {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.println("Do you want to add more data ? if yes press : 1");
            n = sc.nextInt();
        }while (n==1);
    }

    public void traversal()
    {
        Node temp = head;
        if (head==null)
        {
            System.out.println("Linked list doesn't exist");
        }else {
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }while (temp != head);
        }
    }
    public static void main(String[] args) {
        LinkedList_pr5_Circular_Insertion ll = new LinkedList_pr5_Circular_Insertion();
        ll.creation();
        ll.traversal();

    }
}
package LinkedList_programs;

import java.util.Scanner;

public class LinkedList_pr4_Circular_creation
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
        int data, n, m, p;
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
                new_node.next = head;
                head = new_node;
                tail.next = head;
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
        LinkedList_pr4_Circular_creation ll = new LinkedList_pr4_Circular_creation();
        ll.creation();
        ll.traversal();

    }
}

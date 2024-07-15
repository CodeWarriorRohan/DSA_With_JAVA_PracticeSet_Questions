package LinkedList_programs;

import java.util.Scanner;

public class LinkedList_pr1_Singly_creation
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
    public void creation()
    {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to add more data ? If yes, press : 1");
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
            while (temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList_pr1_Singly_creation ll = new LinkedList_pr1_Singly_creation();
        ll.creation();
        ll.traversal();
    }
}
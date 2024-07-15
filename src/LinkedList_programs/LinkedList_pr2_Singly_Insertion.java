package LinkedList_programs;

import java.util.Scanner;
public class LinkedList_pr2_Singly_Insertion
{
    static class Node{
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
        int data,n,c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();

            Node new_node = new Node(data);
            if (head==null)
            {
                head = new_node;
            }else {
                System.out.println("Choose any one location for previously entered element");
                System.out.println("Enter 1 to insert the element at the beginning");
                System.out.println("Enter 2 to insert the element at the end");
                System.out.println("Enter 3 to insert the element at the specific location");
                c = sc.nextInt();
                switch (c)
                {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null)
                        {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.println("Enter the index of element to be inserted");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i=0; i<p-1; i++)
                        {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.println("Do you want to add more data ? if yes, press : 1");
            n = sc.nextInt();
        }while (n==1);
    }
    public void traversal()
    {
        Node temp = head;
        if (head == null)
        {
            System.out.println("Linked list is empty");
        }else {
            while (temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList_pr2_Singly_Insertion ll = new LinkedList_pr2_Singly_Insertion();
        ll.creation();
        ll.traversal();
    }
}
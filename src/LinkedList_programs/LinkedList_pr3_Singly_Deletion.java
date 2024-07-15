package LinkedList_programs;

import java.util.Scanner;

public class LinkedList_pr3_Singly_Deletion
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
    public void deletion()
    {
        int data,n,c,index;
        Scanner sc = new Scanner(System.in);
        do {
            if (head==null)
            {
                System.out.println("Linked list is empty");
            }else {

                System.out.println("Enter 1 to delete the element from beginning");
                System.out.println("Enter 2 to delete the element from end");
                System.out.println("Enter 3 to delete the element from specific location");

                c = sc.nextInt();
                switch (c)
                {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;

                    case 2:
                        Node temp1 = head;
                        Node ptr = head;

                        while (ptr.next != null)
                        {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;

                    case 3:
                        System.out.println("Enter index number of element to be deleted");
                        index = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = head;

                        for (int i=0; i< index-2; i++)
                        {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.println("Do you want to delete more element ? if yes press : 1");
            n= sc.nextInt();
        }while (n==1);

    }
    public void traversal()
    {
        Node temp = head;
        if (head==null)
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
        LinkedList_pr3_Singly_Deletion ll = new LinkedList_pr3_Singly_Deletion();
        ll.creation();
        ll.deletion();
        ll.traversal();
    }
}

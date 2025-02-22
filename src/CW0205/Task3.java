package CW0205;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }   else{
            Node current = head;
            while(current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    boolean check(int data){
        Node current = head;
        while(current.next != null){
            if(current.data == data)    return true;
            current = current.next;
        }
        if(current.data == data)    return true;
        return false;
    }
}

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input how many elements you would like to add:");
        int n1 = scanner.nextInt();
        System.out.println("Input the elements:");
        LinkedList linkedList = new LinkedList();
        for(int i = 0; i < n1; i++){
            int a = scanner.nextInt();
            linkedList.add(a);
        }

        System.out.println("Input how many elements you would like to add:");
        int n2 = scanner.nextInt();
        System.out.println("Input the elements:");
        LinkedList linkedList1 = new LinkedList();
        for(int i = 0; i < n2; i++){
            int a = scanner.nextInt();
            if(linkedList.check(a)){
                System.out.println(a + " ");
            }
            linkedList1.add(a);
        }
    }
}

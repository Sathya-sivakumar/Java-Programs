import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next=null;
    }
}

class SingleLinkedList {
    Node head = null;
    void insert(int n) {
        Node newnode = new Node(n);
        if(head==null) {
            head = newnode;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void display() {
        Node temp = head;
        while(temp!=null) {                                                         
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String args[]) {
        SingleLinkedList ll = new SingleLinkedList();
        Scanner s = new Scanner(System.in);
        while (true) 
        { 
            int n = s.nextInt();
            if(n==-1) {
                break;
            }
            ll.insert(n);
        }
        ll.display();
    }
}
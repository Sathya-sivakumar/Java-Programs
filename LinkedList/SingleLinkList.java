class LinkedList{
     Node head;
     Node tail;
 int size;

    void SingleLinkList(){
        this.size=0;
    }
    class Node{
         int data;
         Node next;
        void Node(int data){
            this.data=data;
        }
    }
    void insert(int data){
        Node new_node= new Node();
        new_node.data=5;
        head = new_node;
        Node new_node1=new Node();
        new_node1.data=55;
        tail= new_node1;
    }
}
class SingleLinkList{
    public static void main(String[] args){
        LinkedList lst=new LinkedList();
        lst.insert(5);
        lst.insert(55);
        System.out.println(lst.head.data); 
        System.out.print(lst.tail.data); 
    }
}
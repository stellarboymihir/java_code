package com.mihir.introduction;

public class middleNode {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//     Represents the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

//     addNode() will add a new node to the list
    public void addNode(int data){

//        Create a new Node
        Node newNode = new Node(data);

//         Check if the list is empty
        if(head == null){
//            If the list is empty, both the head and tails will point to newNode
            head = newNode;
            tail = newNode;
        }else {
//      newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
//             newNode will become new tail of the list
            tail = newNode;
        }
    }
//    CountNodes() will count the nodes present in the list
    public int countNodes(){
        int count = 0;
//         Node current will point to head
        Node current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return  count;
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Nodes of singly Linked List");
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        middleNode sList = new middleNode();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);

        sList.display();

        System.out.println("Count of Nodes present in the List: " + sList.countNodes());
    }
}

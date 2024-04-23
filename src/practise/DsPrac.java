package practise;



import java.util.*;


public class DsPrac {

    public static void _assert(Boolean value) {
        if (!value) {
            System.out.println("<><><><<<<><><><<> Not Valid");
        } else {
            System.out.println("---------------->>>>>> It is valid.");

        }

    }

    public static void main(String[] args) throws Exception {
//        System.out.println("Empty Queue Tests");
//        Queue emptyQueue = new Queue();
//        _assert(emptyQueue.pop() == -1);
//        _assert(emptyQueue.top() == -1);
//
//        System.out.println("Queue with size 1 Tests");
//        Queue queueWithSize1 = new Queue();
//        queueWithSize1.push(10);
//        _assert(queueWithSize1.top() == 10);
//        _assert(queueWithSize1.pop() == 10);
//        _assert(queueWithSize1.top() == -1);
//        _assert(queueWithSize1.pop() == -1);
//
//        System.out.println("Queue Filled -> Empty - Filled Tests");
//
//        Queue dynamicQueue = new Queue();
//        dynamicQueue.push(10);
//        _assert(dynamicQueue.top() == 10);
//        _assert(dynamicQueue.pop() == 10);
//        _assert(dynamicQueue.top() == -1);
//        _assert(dynamicQueue.pop() == -1);
//
//        dynamicQueue.push(10);
//        _assert(dynamicQueue.top() == 10);
//        _assert(dynamicQueue.pop() == 10);
//        _assert(dynamicQueue.top() == -1);
//        _assert(dynamicQueue.pop() == -1);

//        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.insertAtFirst(2);
//        sll.insertAtFirst(1);
//
//        sll.insertAtLast(3);
//        sll.printList();
//
//        sll.deleteAtAny(2);
//        sll.printList();
//        sll.deleteAtLast();
//        sll.printList();
//
//        sll.insertAtFirst(13);
//        sll.deleteAtAny(1);
//        sll.printList();
//        System.out.println(sll.getSize());
//
//        sll.insertAtFirst(23);
//        System.out.println(sll.getSize());
//        sll.insertAtAny(3);
//        sll.printList();
//        sll.insertAtAny(12);
//        sll.printList();
//        sll.deleteAtAny(4);
//        sll.printList();
////        sll.deleteAtAny(5);

//        QueueLinkedNode ql = new QueueLinkedNode();
//        ql.empty();
//        ql.display();
//        ql.enqueue(10);
//        ql.enqueue(20);
//        ql.enqueue(30);
//        ql.enqueue(40);
//        ql.enqueue(50);
//        ql.display();
//        ql.dequeue();
//        ql.display();

//        StackUsingLinked s = new StackUsingLinked();
//        s.pop();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.pop();
//        s.push(40);
//        s.printStack();
////        System.out.println(s.pop());
//        System.out.println(s.size);
//        System.out.println(s.stackIsEmpty());

//        StackUsingArray sa = new StackUsingArray(5);
//        sa.isEmpty();
//        sa.display();
//        sa.push(5);
//        sa.push(10);
//        sa.push(15);
//        sa.peek();
//        System.out.println(sa.peek());
//        sa.push(20);
//        sa.push(25);
//        sa.pop();
//        sa.push(30);
//
//        sa.display();
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleMain();

//        QuickSort qS = new QuickSort();
//        qS.quickMain();

//        MergeSort mS = new MergeSort();
//        mS.mergeMain();

//        HeapSort hS = new HeapSort();
//        hS.heapMain();

//        Trees tree = new Trees();
//        tree.treeMain();
    }

    // top -> will always return top element in the queue

    // push()

    // Pop () -> Int


    // print() it wil print the whole queue
}
class Queue{
    private ArrayList<Integer> arrList = new ArrayList<>();

    public  int top(){
        if(!arrList.isEmpty()){
            return arrList.get(0);
        }else {
            return -1;
        }
    }
    public  void push(int num){
        arrList.add(num);
    }
    public  int pop() {
        if (!arrList.isEmpty()){
            return arrList.remove(0);
        }
        return -1;
    }
}

// Append
// First
// Last
// isEmpty
// Remove(at: index)
class SinglyLinkedList {
    Node head;
    private int size;

    SinglyLinkedList(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
            size++;
        }
    }


//    Node newNode = new Node(newData);
    Node currNode = head;

    public int insertAtFirst(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;

            return -1;
        }
        newNode.next = head;
        head = newNode;
        return -1;
    }
    public int insertAtAny(int newData){
        if (head == null){
            return -1;
        }
        Node newNode = new Node(newData);
        newNode.next = head.next;
        head.next = newNode;
        return -1;
    }
    public int insertAtLast(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;

            return -1;
        }

       Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        return -1;
    }

    public void printList(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
//        currNode.next = newNode;
        System.out.println("NULL");
    }

    public int deleteAtFirst(){
        if (head == null){
            return -1;
        }
        size--;
        head = head.next;
        return -1;
    }
//
    public int deleteAtLast(){
        if (head == null){
            System.out.println("The list is empty");
            return -1;
        }

        size--;
        if (head.next == null){
            head = null;
            return -1;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return -1;

    }

    public int deleteAtAny(int position){
        if (head == null || position < 0){
            return -1;
        }

        if(position == 0){
            head = head.next;
            return -1;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return -1;
        Node next = temp.next.next;
        temp.next = next;
        return -1;

    }

    public int getSize(){
        return size;
    }

//    public int search(){
//
//    }
}

//Enqueue -> (Insert Node at rare end)
//Dequeue -> (Delete Node from front end)
//Peek -> (Return value of front node without dequeuing)
//Empty -> (Return True when queue is empty else false)
//Size -> (Returns size of queue)

class QueueLinkedNode{
    int value;
    QueueLinkedNode next;
    private QueueLinkedNode front, rear;
    int size;

    QueueLinkedNode(){
        front = rear = null;
         size = 0;
    }
    void empty(){
        front = null;
        rear = null;
        size = 0;
        System.out.println("The linked queue list is empty");
    }
    public void enqueue(int data){
        QueueLinkedNode  temp = new QueueLinkedNode();
        temp.value = data;
        if (front == null){
            front = temp;
            rear = temp;
        }else {
            rear.next= temp;
            rear = temp;
        }
        size++;
    }

    public void dequeue(){
        if (front == null){
        }else {
            System.out.println(front.value + " Removed from Queue");
//            QLinked temp = front;
            front = front.next;
            size--;
        }
    }

    public void display(){
        if (front == null){
            System.out.println("Queue is empty");
            return;
        }

        QueueLinkedNode current = front;
        System.out.print("Queue: ");
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        
        System.out.println();
    }

}

class StackUsingLinked{
    private class stackNode{
        int data;
        stackNode next;
        stackNode(int d){
            data = d;
            next = null;
        }
    }

    stackNode top;
    int size;
    StackUsingLinked(){
        this.top = null;
        this.size = 0;
    }

    public int push(int x){
        stackNode element = new stackNode(x);
        element.next = top;
        top = element;
        System.out.println("Elements pushed");
        size++;
        return -1;

    }
    public int pop(){
        if (top == null)
        {
            return -1;
        }
        int topData = top.data;
        stackNode temp = top;
        top = top.next;
        return topData;
    }

    public int getSize(){
        return size;
    }

    public boolean stackIsEmpty(){
        return top == null;
    }

    public void printStack(){
        stackNode current = top;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

class StackUsingArray{
    int arr[];
    int top;
    int capacity;
    private int[] res;

    StackUsingArray(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    public void push(int data) throws Exception {
        if (top == capacity - 1){
            throw new Exception("Array is filled / Overflowing");
        }
        top++;
        arr[top] = data;
    }

    public int pop() throws Exception{
        if (top == -1){
            throw new Exception("Array is empty / Underflowing");
        }
        int res = arr[top];
        top--;
        return res;
    }

    public int peek() throws Exception{
        if (top == -1){
            throw new Exception("Array is empty");
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public int display(){
        if (isEmpty()){
            return -1;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return -1;
    }
}

class BubbleSort{
    public void bubbleSort(int[] bubbleArr){
        int n = bubbleArr.length;
       ;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n - 1; j++){
                if (bubbleArr[i] > bubbleArr[j]){
                    int temp = bubbleArr[i];
                    bubbleArr[i] = bubbleArr[j];
                    bubbleArr[j] = temp;

                }
            }
        }
    }

    public void bubbleMain(){
        int[] bsArr = {34, 45, 12, 42, 2, 56};

        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(bsArr);

        System.out.println("Sorted arr: ");
        for (int num : bsArr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

class QuickSort{
    public int partitionAtLast(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public int partitionAtFirst(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low + 1;
        for (int j = low + 1; j <= high; j++){
            if (arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[low];
        arr[low] = arr[i - 1];
        arr[i - 1] = temp;
        return i - 1;
    }

    public int randomIndex(int[] arr, int low, int high){
        Random random = new Random();
        int ranIdx = low + random.nextInt(high - low + 1);
        int temp = arr[low];
        arr[low] = arr[ranIdx];
        arr[ranIdx] = temp;
        return partitionAtFirst(arr, low, high);
    }
    public void quickSort(int[] arr, int low, int high){
        if (arr.length == 0){
            return;
        }
        if(low < high){
//            int pidx = partitionAtLast(arr, low, high);
//            int pidx = partitionAtFirst(arr, low, high);
            int pidx = randomIndex(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }

    }
    public void quickMain(){
        int[] arr = {23, 52, 11, 45, 12, 43};
        int[] arr1 = {10, 7, 8, 9, 2, 6,};
        int n = arr.length;
        int n1 = arr1.length;
        quickSort(arr, 0, n-1);
        quickSort(arr1, 0, n1-1);

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < n1; i++){
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
    }

}

class MergeSort{
    public void conquer(int[] arr,int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public void divide(int[] arr, int si, int ei){
     if(si >= ei){
         return;
     }

     int mid = si + (ei - si) / 2;
     divide(arr, si, mid);
     divide(arr, mid + 1, ei);
     conquer(arr, si, mid, ei);
    }

    public void mergeMain(){
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//     TC -->> O(nlogn)

}

class HeapSort{
    void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

//         If left child is larger than the root
        if (left < n && arr[left] > arr[largest]){
            largest = left;
        }
//        If right child is larger than the root
        if (right < n && arr[right] > arr[largest]){
            largest = right;
        }

//         Root is not largest
        if (largest != i){
//             swap arr[i] with arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, i);
        }
    }
     void heapSort(int arr[], int n){
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n -1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);

        }
    }

     void printArr(int[] arr, int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    void heapMain(){
        int arr[] = {45, 5, 22, 40,  21, 24, -2};
        int n = arr.length;
        System.out.print("Before sorting elements are: " );
        printArr(arr, n);
        heapSort(arr, n);
        System.out.print("\n After sorting elements are: ");
        printArr(arr, n);
    }
}

class Tree{
    public void printParent(int node, Vector<Vector<Integer>> adj, int parent){
        if (parent == 0){
            System.out.println(node + "--> Root");
        }else {
            System.out.println(node + "--> " + parent);
        }

        for (int i = 0; i < adj.get(node).size(); i++)
            if (adj.get(node).get(i) != parent)
                printParent(adj.get(node).get(i), adj, node);
    }

    public void printChildren(int Root, Vector<Vector<Integer>> adj){
        Queue q = new Queue();
        q.push(Root);

        int[] vis = new int[adj.size()];
        Arrays.fill(vis, 0);

//        while (q.size() != 0){
            int node = q.top();
            q.pop();
            vis[node] = 1;
            System.out.println(node + "-> ");
            for (int i = 0; i < adj.get(node).size(); i++){
                if (vis[adj.get(node).get(i)] == 0){
                    System.out.print(adj.get(node).get(i) + " ");

                    q.push(adj.get(node).get(i));
                }
            }
            System.out.println();
        }
//    }

    public void printLeafNodes(int Root, Vector<Vector<Integer>> adj){
        for (int i = 1; i < adj.size(); i++)
            if(adj.get(i).size() == 1 && i != Root)
                System.out.print(i + " ");
        System.out.println();
    }

    public void printDegree(int Root, Vector<Vector<Integer>> adj){
        for (int i = 1; i < adj.size(); i++){
            System.out.println(i + " ");

            if (i == Root)
                System.out.println(adj.get(i).size());
            else
                System.out.println(adj.get(i).size() - 1);
        }
    }

    public void treeMain(){
        int N = 7, Root = 1;
        Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>();
        for (int i = 0; i < N + 1; i++){
            adj.add(new Vector<Integer>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        adj.get(2).add(5);
        adj.get(5).add(2);

        adj.get(2).add(6);
        adj.get(6).add(2);

        adj.get(4).add(7);
        adj.get(7).add(4);

        System.out.println("The parents of each node are: ");
        printParent(Root, adj, 0);

        System.out.println("The children of each node are: ");
        printChildren(Root, adj);

        System.out.println("The leaf nodes of the tree are: ");
        printLeafNodes(Root, adj);

        System.out.println("The degrees of each node are: ");
        printDegree(Root, adj);
    }
}
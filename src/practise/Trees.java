package practise;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Trees {
    ArrayList<Integer> arr = new ArrayList<>(100);
    public static void main(String[] args) {

        Trees tree = new Trees();
        tree.start();

        System.out.println("End");
    }

    private void start() {
        for(int i = 0; i <100; i++) {
            arr.add(i, -1);
        }

        insert(11, 0);
        insert(30, 0);
        insert(15, 0);
        insert(60, 0);
        insert(5, 0);
//        insert(30, 0);
//        insert(30, 0);



        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("In Order");
        inorder(0);
        System.out.println("Pre Order");

        preOrder(0);
        System.out.println("Post Order");

        postOrder(0);
    }

    public void insert(int value, int index) {
         if (arr.get(index) == -1) {
             arr.set(index, value);
         } else if (arr.get(index) < value) {
             System.out.println("Found" +  arr.get(index) + "Less than " + value);
             insert(value, 2*index + 2);
         } else if (arr.get(index) >= value) {
             System.out.println("Found" +  arr.get(index) + "greater than " + value);
             insert(value, 2*index + 1);
         }
    }

    public  void preOrder(int index) {
        if (arr.get(index) == -1) {
            return;
        }
        System.out.print(arr.get(index) + " ");
        preOrder(index*2 + 1);
        preOrder(index*2 + 2);
    }

    public  void postOrder(int index) {
        if (arr.get(index) == -1) {
            return;
        }
        postOrder(index*2 + 1);
        postOrder(index*2 + 2);
        System.out.print(arr.get(index) + " ");
    }

    public void inorder(int index) {
        if (arr.get(index) == -1) {
            return;
        }
        inorder(index*2 + 1);
        System.out.print(arr.get(index) + " ");
        inorder(index*2 + 2);
    }



}
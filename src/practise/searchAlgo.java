package practise;

public class searchAlgo {
    public static void main(String[] args) {
        int[] arrA = {10, 20, 30, 40, 50, 60};
        int key = 50;


        int index = linearSearch(arrA, key);

      if (index != -1){
          System.out.println("Element " + key + " found in the array " + index);
      }else {
          System.out.println("Element " + key + " not found in the array");
      }
    }
    public static int linearSearch(int[] arr, int element){
        if (arr == null || arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

}

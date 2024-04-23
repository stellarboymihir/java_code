package practise;

public class sqEven {


    public static int[] squareEven(int[] arr){
        if (arr == null){
            return null;
        }
        for (int i = 0; i < arr.length; i += 2){
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, -2, -9, 11, 56, -12, -3};
        int[] sqArr = squareEven(arr);
        for (int num : sqArr){
            System.out.print(num + " ");
        }
    }
}

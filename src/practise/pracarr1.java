package practise;

public class pracarr1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 4, 5, 6, 8, 7};
        System.out.println("Duplicate elements in the given array: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

package practise;

public class replaceElement {
    public static int[] replaceElement(int[] arr){
        int greatest = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = greatest;
            if (temp > greatest){
                greatest = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = replaceElement(arr);
        for(int num : result){
            System.out.print(num + " ");

        }
    }
}

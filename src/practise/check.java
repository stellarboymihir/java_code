package practise;

public class check {
    public static boolean checkIfExist(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == 2 * arr[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));

    }
}

package practise;

public class rev {
    public static void reverse(int x){
//        int rev = 0;
////        while(x != 0){
////            int remain = x % 10;
////            rev = rev * 10 + remain;
////            x = x / 10;
//        for (; x != 0; x = x/10){
//            int remain = x % 10;
//            rev = rev * 10 + remain;
//        }
//        return rev;
        if (x < 10){
            System.out.println(x);
            return ;
        }else {
            System.out.println(x % 10);
            System.out.println(x / 10);
        }

    }

    public static void main(String[] args) {
        int x = -32431;
//        System.out.println(reverse(x));
        reverse(x);
    }
}

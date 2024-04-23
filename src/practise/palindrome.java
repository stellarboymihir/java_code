package practise;

public class palindrome {
    public static boolean isPalindrome(int x){
//        int i = 0, sum = 0, temp = 0;
//
//        temp = x;
//        while(x > 0){
//            i  = x / 10;
//            sum = (sum * 10) + i;
//            x /= 10;
//        }
//        if(temp == sum){
//            return true;
//        }else {
//            return false;
//        }
//        if(x < 0 || (x != 0 && x % 10 == 0))
//            return false;
//
//        int rev = 0;
//        while (x > 0){
//            rev = rev * 10 + x % 10;
//            x /= 10;
//        }
//        return (x == rev || x == rev / 10);
        int temp = x;
        int rev = 0;
        while (x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        if(rev == temp){
            return true;
        }
return false;
    }

    public static void main(String[] args) {
        int x = 454;
        System.out.println(isPalindrome(x));

    }

}

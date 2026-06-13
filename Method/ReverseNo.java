public class ReverseNo {
    public static void PrintDisplay(int n){
        int reversed =0;
        while(n>0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n /10;
        }
        System.out.println(reversed);

    }
    public static void main(String[] args) {
        PrintDisplay(1234);
    }
    
}

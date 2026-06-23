public class RecursionPrint1toN {
    public static void printDisplay(int n){
        if(n == 0){
            return;
        }
        printDisplay(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        printDisplay(5);
    }
}

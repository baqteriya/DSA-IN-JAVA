public class EvenOdd {
    public static void printDisplay(int n){
        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
    public static void main(String[] args) {
        printDisplay(3);
         printDisplay(4);
    }
}

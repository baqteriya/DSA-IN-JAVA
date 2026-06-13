public class FactorialMe {
    public static void printDisplay(int n){
        int fact = 1;
        for(int i=1;i<= n;i++){
            fact = fact*i;

            }
            System.out.println(fact);

        }
    public static void main(String[] args) {
        printDisplay(5);
    }
}

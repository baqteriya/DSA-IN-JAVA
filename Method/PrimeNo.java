public class PrimeNo {
    public static void printDisplay(int n){
        int count = 0;
        for(int i = 1;i <= n; i++){
        if(n % 1 == 0){
            count++;

        }
    }
    if(count == 2){
        System.out.println("prime");
    }else{
        System.out.println("Not prime");
    }
}
    public static void main(String[] args) {
        printDisplay(2);
        printDisplay(12);
   
     }
     }


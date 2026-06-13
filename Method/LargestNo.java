public class LargestNo {
    public static void printDisplay(int a, int b,int c){
        if(a>b && b>c){
            System.out.println("A is largest:"+ a);
        }else if(b>c){
            System.out.println("B is largest:"+ b);
        }else{
            System.out.println("C is largest:"+ c);
        }

    }
    public static void main(String[] args) {
        printDisplay(7, 9, 3);
    }
}

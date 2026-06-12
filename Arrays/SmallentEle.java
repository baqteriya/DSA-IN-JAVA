
public class SmallentEle {
    public static void main(String[] args) {
        int arr[]={11,22,3,4,5};
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println( "Smallest element in array:"+smallest);
    }
}

public class SecondLar {
    public static void main(String[] args) {
        int arr[] = {12,33,44,2,3};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] != largest && secondLargest<arr[i]){
                secondLargest = arr[i];

            }
        }
        System.out.println("secondLargest element:"+secondLargest);
    }
}

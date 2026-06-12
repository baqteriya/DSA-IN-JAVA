public class LargestElement {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,99};
         int largest =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
                System.out.println(largest);
            }
        }
    

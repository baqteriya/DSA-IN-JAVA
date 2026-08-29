class FirstBadVer{
     static boolean isBadVersion(int version){
        return version>=4;

    }
    public static void main(String[] args) {
        int n = 7;
        int left =  1;
        int right = n;
        while(left<right){
            int mid =left+(right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        System.out.println(left);
        
    }
}


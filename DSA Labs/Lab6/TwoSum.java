class TwoSum{

    public static boolean twosum(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            int first=i;
            int left=i;
            int last=arr.length-1;
            while(left<=last){
                int mid=(left+last)/2;
                    if(arr[first]+arr[mid]==key && first!=mid ){
                    return true;
                    }
                        if(arr[first]+arr[mid]<key){
                             left=mid+1;
                            }
                             else{
                              last=mid-1;
                          }
                        }
                    }
                    return false;
                }


    public static void main(String[] args) {

        int arr[]={2,3,4,5,6};
        System.out.println(twosum(arr, 2));
        
    }
}
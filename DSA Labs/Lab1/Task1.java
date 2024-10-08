class Task1{

    public static void oddeven(int arr[]){
        int arr1[]=new int[arr.length];
        int k=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                // System.out.println(arr[i]);
                arr1[++k]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
            {
               // System.out.println(arr[i]);
               arr1[++k]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
           System.out.print( arr1[i]+" ");
        }
}
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6,7,8,6,9};
            oddeven(arr);
        
        
    }
}

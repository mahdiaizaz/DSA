public class MergeSort {

    public static void mergeSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
       merge(arr, start, mid, end);
    }
    public static void merge(int arr[], int left, int mid, int right){
        int temp[]=new int[right-left+1];
        int i=left, j=mid+1, k=0;
        while(i<=mid&& j<=right){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(k=0, i=left; k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

        public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
       
      

    }
    
}

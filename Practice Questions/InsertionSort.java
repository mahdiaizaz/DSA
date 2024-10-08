public class InsertionSort {
    public static void insertionSort(int arr[]){
        System.out.println("before sorting");
        for(int k=0;k<arr.length;k++){
         System.out.print(arr[k]+" ");
        }
        System.out.println();
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("after soarting");
       for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
       }
       System.out.println();
    }
    public  static void bubleSort(int arr[]){
      
        for(int i=0;i<arr.length-1;i++){
          int tempo = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                   tempo++;
                }
            }
            if(tempo == 0){
                break;
             }
       }
        System.out.println("after soarting");
        for(int k=0;k<arr.length;k++){
         System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid , int ei){
        int t[]= new int[ei-si+1];
        int i=si, j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                t[k++]=arr[i++];
            }
            else{
                t[k++]=arr[j++];
            }
        }
        while(i<=mid){
            t[k++]=arr[i++];
        }
        while(j<=ei){
            t[k++]=arr[j++];
        }
        for(int p=si,l=0; l<t.length;l++, p++){
            arr[p]=t[l];
        }
    }
      public  static void print(int arr[]){
        for(int il=0;il<arr.length;il++){
            System.out.print(arr[il]+" ");
        }
        System.out.println();
     }
    public static void main(String[] args) {
         int arr[]={6,5,4,3,2,1};
        //  mergesort(arr, 0, arr.length-1);
        //  print(arr);
        //  selection(arr);
         insertionSort(arr);
          int k[]={8,9,10};
        selection (k);
         

    }
    
}

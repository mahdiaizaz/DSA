public class Task2 {

    public static void nodub(int arr[][], int arr1[]){
        int size=arr1.length;
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               boolean exist=false;
               for(int m=0;m<=k;m++){
                    if(arr1[m]==arr[i][j]){
                         size--;
                        exist=true;
                        break;
                    }

                }
                if(exist==false){
                    arr1[k++]=arr[i][j];
                }
               
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
       

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,6}, {5,6,7,8},{9,33,23,34},{15,14,21,23},{10,11,12,13}};
        int arr1[]=new int[arr.length*arr[0].length];
        nodub(arr,arr1);

    }
    
}

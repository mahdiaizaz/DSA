public class TAst4 {

    public static void firstlast(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==0 ||j==0 || i==arr.length-1 ||j==arr[0].length-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
    }

    public static void middle(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=0 && j!=0 && i!=arr.length-1 && j!=arr[0].length-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {

    int arr[][]={{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

    System.out.println("sides of the array`");
    firstlast(arr);
    System.out.println();
    System.out.println();
    System.out.println("middle of the array");
    middle(arr);
    
   }
    
}

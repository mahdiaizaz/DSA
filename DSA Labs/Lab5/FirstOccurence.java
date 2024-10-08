public class FirstOccurence {
    public static char firstOccurence(char arr[], int n){
        for(int i=0;i<arr.length-1;i++){     int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return '/';
    }


    public static char finstring(String  arr, int n){
        for(int i=0;i<n-1;i++){
            char c=arr.charAt(i);
            int count=1;
            for(int j=i+1;j<n;j++){
                if(c==arr.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return c;
            }
        }
        return '/';
    }
    public static void main(String[] args) {
        char ch[]={'A','B','C','E','G','F','H','I','J','K','G','F',
        'D','N','M','L','P','O','Q','R','S','T','U','V','W','B','A','Z'};
        System.out.println(firstOccurence(ch, ch.length));

        String p="ASLAM BROTHER";
        System.out.println(finstring(p, p.length()));
    }
    
}

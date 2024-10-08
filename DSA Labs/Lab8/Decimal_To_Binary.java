class Decimal_To_Binary{
    public static void decimaltobinary(int number){
        if(number==1){
            //return number;
            System.out.print(number+" ");
            return;
        }
        else{
            decimaltobinary(number/2);
            int binary=number%2;
            System.out.print(binary+" ");
            // return binary; 
        }
    }

    public static String otherapprach(int num){
        if(num==0){
            return "";
        }
        else {
            return otherapprach(num/2)+ num%2;

        }

    }

    public static boolean checkPalindrome(String check)
    {
        int mid= check.length()/2;
        int last=check.length()-1;
        int i=0;
        while( i<=mid && last>=mid)
        {
            if(check.charAt(i)!=check.charAt(last)){
                return false;
            }
            i++;
            last--;

        }
        return true;
    }
    
    public static boolean checkPalindromer(String check, int start , int end)
    {
        if(check.charAt(start)!=check.charAt(end))
        {
            return false;
        }
        if(start>=end)
        {
            return true;
        }
        return checkPalindromer(check, start+1,end-1);
    }

   
    public static void main(String[] args) {
    //System.out.println(decimaltobinary(5));
    //decimaltobinary(13);
    System.out.println(otherapprach(5));
    String s="racecar";
    int start =0;
    int end=s.length()-1;
    //int mid=(start+end)/2;
    System.out.println(checkPalindromer(s, start, end));
   

    }
}
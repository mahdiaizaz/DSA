import java.util.Stack;

class Lb5Task2Balancebracaktes{
    public static boolean isvalid(String str){
        Stack<Character> c=new Stack<>();
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
                if(ch=='(' || ch=='{' || ch=='['){
                    c.push(ch);
                }
                else if( ch!=')' && ch!='}' && ch!=']'){
                    continue;
            }
                else{
                        if(c.isEmpty()){
                            return false;
                        }
                            if(c.peek()=='('&& ch==')' || c.peek()=='{'&& ch=='}' || c.peek()=='['&& ch==']'){
                            
                                c.pop();
                            }
                            else{
                                return false;
                            }
                }
        }
            if(c.isEmpty()){
                return true;
            }
            else{
                return false;
            }
    }


    public static boolean isdublicate(String str){
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int c=0;
                while(s1.peek()!='('){
                    s1.pop();
                    c++;
                }
                if(c<1){
                    return true;
                }
                else{
                    s1.pop();
                }
            }
            else{
                s1.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String s="{{k}+(a+b)+[k]}";
        System.out.println(isvalid(s));
        // String k="((a+b))",l="(a-b)";
        // System.out.println(isdublicate(k)); 
        // System.out.println(isdublicate(l));       
    
}
}
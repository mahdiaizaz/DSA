import java.util.Stack;
public class Infix_prefix {
    public static int prec(char c){
        if(c=='^'){return 3;
        }
        if(c=='*' || c=='/'){
            return 2;
        }

        if(c=='+' ||c=='-'){
            return 1;
        }
        return -1;
    }
//infix-prefix
    public static StringBuilder infixprefix(String str){
        //String s2="";
        StringBuilder s2=new StringBuilder();
        Stack<Character> c=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>=0 && ch<=9)){
                s2.append(ch);
            }
            else{
                if(c.isEmpty()){
                    c.push(ch);
                }
                else{
                    while(!c.isEmpty() && prec(c.peek())>=prec(ch)){
                        s2.append(c.pop());
                    }
                    c.push(ch);
                }
            }
        }
        while(!c.isEmpty()){
            s2.append(c.pop());
        }
        return s2;
    }
    public static void main(String[] args) {

        String s="A+B*C+D/H";
        System.out.println(infixprefix(s));
        
    }
    
}

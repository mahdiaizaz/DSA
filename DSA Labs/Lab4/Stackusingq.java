public class Stackusingq extends Queuelinkedlist{
    Queuelinkedlist q1=new Queuelinkedlist();
    Queuelinkedlist q2=new Queuelinkedlist();


    public void push(int data)
    {
        if(!q1.isEmpty())
        {
            q1.enqueue(data);
        }
        else{
            q2.enqueue(data);
        }
    }

    public boolean isEmpty()
    {
        return q1.isEmpty() && q2.isEmpty();
    }


public int pop()
{
   if(isEmpty())
   {
    System.out.println("q is empty");
    return -1;
   }
   int top=-1;
    if(!q1.isEmpty())
    {
        while(!q1.isEmpty())
        {
            top=q1.dequeue();
            if(q1.isEmpty())
            {
                break;
            }
            q2.enqueue(top);
        }

    }
    else{

        while(!q2.isEmpty())
        {
            top=q2.dequeue();
            if(q2.isEmpty())
            {
                break;
            }
            q1.enqueue(top);
        }

    }


    return top;

}
public static void main(String[] args) {
    Stackusingq s=new Stackusingq();
    s.push(2);
    s.push(4);
    s.push(6);
    s.push(8);
    System.out.println(s.pop());
    System.out.println(s.pop());
s.push(7);
    System.out.println(s.pop());

    System.out.println(s.pop());
    System.out.println(s.pop());


    // while(s.isEmpty())
    // {
    //     System.out.println(s.pop());
       

    // }
}

    
}

public class StackInlist {
    private Node top;
    public StackInlist() {
    this.top = null;
    }
    // A linked list node 
class Node{
 int data; // integer data 
 Node next;
 Node (int data){
    this.data=data;
    this.next=null;
 } // pointer to the next node 
}
//push
public void push(int data){
    Node n=new Node(data);
    if(top==null){
        top=n;return;
    }
    n.next=top;
    top=n;
}
//pop
public int pop(){
    if(top==null){
        System.out.println("No node to return");
        return -1;
    }
    int k=top.data;
    top=top.next;
    return k;
}
//isEmpty
public boolean isEmpty(){
    return top==null;
}
//peek
public int peek(){
    return top.data;
}



public static void main(String[] args)
{
  
    StackInlist stack = new  StackInlist();
    stack.push(1);
    System.out.println("inserting "+stack.peek());
    stack.push(2);
    System.out.println("inserting "+stack.peek());

    stack.push(3);
    System.out.println("inserting "+stack.peek());



    System.out.println("Top element is " + stack.peek());
    System.out.println("removing element "+stack.pop());
    System.out.println("removing element "+stack.pop());
    System.out.println("removing element "+stack.pop());

    if (stack.isEmpty()) {
    System.out.print("Stack is empty");
    } else {
    System.out.print("Stack is not empty");
    }
}
    
}


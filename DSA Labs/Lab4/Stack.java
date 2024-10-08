class Stack
{
 private int arr[];
 private int top;
 private int capacity;
 // Constructor to initialize stack 
 Stack(int size)
 {
 arr = new int[size];
 capacity = size;
 top = -1;
 }
 // Utility function to add an element x in the stack and 
// check for stack overflow 
 public void push(int data)
 {
if(top<arr.length)
{
    arr[++top]=data;
} }
 // Utility function to pop top element from the stack and 
// check for stack underflow 
 public int pop()
 {
    if(top<0)
    {
        System.out.println("is empty stack");
     
        return -1;
    }
    capacity--;
   

    
    return arr[top--];


}
 // Utility function to return top element in a stack 
 public int peek()
 {
return arr[top] ;
 }
 // Utility function to return the size of the stack 
 public int size()
 {
return capacity;
 }
 // Utility function to check if the stack is empty or not 
 public Boolean isEmpty()
 {
return top==-1; }
 // Utility function to check if the stack is full or not 
 public Boolean isFull()
 {
return top==capacity; }
 public static void main (String[] args)
 {
 Stack stack = new Stack(3);
 stack.push(1); 
 System.out.println("inserting "+stack.peek()); 
 stack.push(2);
 System.out.println("inserting "+stack.peek());
System.out.println("removeing "+  stack.pop());
 System.out.println("removing "+stack.pop());
 stack.push(3);
 System.out.println("inserting "+stack.peek()); // Inserting 3 in the stack 
 System.out.println("Top element is: " + stack.peek());
 System.out.println("Stack size is " + stack.size());
System.out.println("removing "+ stack.pop()); // removing the top 3 
 // check if stack is empty 
 if (stack.isEmpty())
 System.out.println("Stack Is Empty");
 else
 System.out.println("Stack Is Not Empty");


//  stack.push(12);
//  stack.push(14);
//  stack.push(57);
//  while(!stack.isEmpty())
//  {
//     System.out.println(stack.peek());
//     stack.pop();
//  }

 }

 
}
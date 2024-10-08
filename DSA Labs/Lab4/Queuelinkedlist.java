
class Queuelinkedlist
{
    
static class Node
{
 int data; 
 Node next; 
 Node(int data){
 this.data = data;
 this.next = null;
 }
}

 public  Node rear = null, front = null;
 
 public  int dequeue()  
 {
    if(front==null)
    {
        System.out.println("No node to remove");
    }
    int k= front.data
    ;
    front=front.next;
    return k;
 
 }
 public  void enqueue(int data) 
 
 {
    Node n=new Node(data);
    if(front==null)
    {
        front=rear=n;
        return;

    }
    rear.next=n;
    rear=n;
 }
 public  int peek()
 {
    return rear.data;
 }
 public  boolean isEmpty()
 {
    return front==null;
 }

 public static void main(String[] args)
 {
    Queuelinkedlist q = new Queuelinkedlist();
 q.enqueue(1);
 System.out.println("inserting "+q.peek());
 q.enqueue(2);
 System.out.println("inserting "+q.peek());
 
 q.enqueue(3);
 System.out.println("inserting "+q.peek());

 q.enqueue(4);
  System.out.println("inserting "+q.peek());

 System.out.println("Front element is \n"+ q.peek());
System.out.println("removing  element\n "+ q.dequeue());
System.out.println("removing  element "+ q.dequeue());
System.out.println("removing  element "+q. dequeue());
System.out.println("removing  element "+q. dequeue());

 if (q.isEmpty()) {
 System.out.print("Queue is empty");
 } else {
 System.out.print("Queue is not empty");
 }
 }
}

class Queue1{
            private int arr[];
            private int front;
            private int rear;
            private int capacity;
            private int count;
// Constructor to initialize queue 
        Queue1(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }
// Utility function to remove front element from the queue 
// and check for Queue Underflow 
        public int dequeue(){
                    if(isEmpty()){
                                 System.out.println("no element");
                                 return -1;
                                }
                                 int k=arr[rear];
                                rear=rear+1;
                                count--;
                                return k;
                            }


//dequeue
        public void enqueue(int item){
        if(count<arr.length) {
            arr[front]=item;
            front=front+1;
            count++;
        }
    }
// peek 
        public int peek(){
        return arr[rear];
     }
//size     
        public int size(){
            return count;
        }
// Utility function to check if the queue is empty or not 
        public Boolean isEmpty(){
        return count==0;
     }
// Utility function to check if the queue is empty or not 
        public Boolean isFull(){
        return count ==capacity;
        }

 
 public static void main (String[] args){
    // create a queue of capacity 5 
    Queue1 q = new Queue1(5);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    System.out.println("Front element is: " + q.peek());
    System.out.println("removing element "+ q.dequeue());
    System.out.println("Front element is: " + q.peek());
    System.out.println("Queue size is " + q.size());
    System.out.println("removing element "+ q.dequeue());
    System.out.println("removing element "+ q.dequeue());

    if (q.isEmpty())
    System.out.println("Queue Is Empty");
    else
    System.out.println("Queue Is Not Empty");
    }
}
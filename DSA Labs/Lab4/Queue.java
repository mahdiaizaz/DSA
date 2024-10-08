
    class Queue{
       public int arr[]=new int[5];
        int write=0,read=0;
        int size=0;
//push method
    public  void push(int data){
            if(size<arr.length){  
                arr[write]=data;
                write=(write+1)%arr.length;
                size++;
            }
            else {
                // arr[size%arr.length]=data;
                // write++;
                // size++;
            }
        }
//pop        

        public int pop(){
            if(size==0){
                System.out.println(" queue is empty");
                return -1;
            }
            int go=arr[read];
            size--;
            read =(read+1)%arr.length;
            return go;
        }
// Prints all elements in the queue
    public void printQueue() {
            if (size == 0) {
                              System.out.println("Queue is empty");
                                return;
        }
                        int i = read;
                            for (int count = 0; count < size; count++) {
                               System.out.print(arr[i] + " ");
                                i = (i + 1) % arr.length;  // Circular movement
        }
                         System.out.println();
    }
        public static void main(String[] args) {

            Queue q=new Queue();
            q.push(2);
            q.push(4);
            q.push(5);
            q.push(6);
            q.push(7);
            q.push(8);
            q.printQueue();


            // System.out.println(q.pop()); 
            // System.out.println(q.pop());
            q.pop();
            q.pop();
            q.printQueue();

            q.push(3);
            q.push(4);
            //System.out.println(q.pop());
            q.printQueue();
            q.pop();
            q.printQueue();
            q.pop();
            q.printQueue();




            
        }

    }

   


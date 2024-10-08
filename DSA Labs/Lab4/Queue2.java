public class Queue2 {
    int arr[]= new int[5];
    int read=0, write=0, size=0;
//enqueue
    public void enqueue(int data){
        if(size<arr.length){
            arr[write]=data;
            write=(write+1)%arr.length;
            size++;

        }
        else{
            System.out.println("array is full");
        }
    }
//dequeue
    public int dequeue(){
        if(size==0){
            return -1;

        }
        int d=arr[read];
        read=(read+1)%arr.length;
        size--;
        return d;
    }
//print
    public void print(){
        if(size==0){
            System.out.println(" No element to print");
            return;
        }

        int i=read;
        for(int c=0;c<size;c++){
            System.out.print(arr[i]+" ");
            i=(i+1)%arr.length;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue2 q=new Queue2();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.enqueue(77);
        q.enqueue(99);
        q.enqueue(44);
        q.enqueue(332);
        q.print();
    }
    
}

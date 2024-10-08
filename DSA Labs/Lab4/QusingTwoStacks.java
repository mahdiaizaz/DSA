public class QusingTwoStacks extends StackInlist {
    StackInlist s1=new StackInlist();
    StackInlist s2=new StackInlist();
//is empty
  public boolean sEmpty(){
      return s1==null && s2==null;
  }
  //enqueue
    public void enqueue(int data) {
        s1.push(data);
    }
  //dequeue
    public int dequeue(){
      int top;
      while(!s1.isEmpty()){
        s2.push(s1.pop());
      }
      top=s2.pop();
      while(!s2.isEmpty()){
        s1.push(s2.pop());
      }
       return top;
    }
    public static void main(String[] args) {
        QusingTwoStacks q=new QusingTwoStacks();
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(34);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());




    }
   

}
    


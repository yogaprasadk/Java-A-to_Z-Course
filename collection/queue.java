import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args){
        Queue<Integer> l = new LinkedList<>();

        //        insert value in linked list of queue

        l.offer(3);
        l.offer(45);
        l.offer(345);
        l.offer(12);
        l.offer(0);
        System.out.println(l);

//       peek -  return the head position of the queue
        System.out.println(l.peek());
//        poll -  delete head position value from the queue
        l.poll();
        System.out.println(l);
    }
}

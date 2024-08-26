import java.util.*;
public class priorityqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> n = new PriorityQueue<>();
        //add element in priority queue
        n.offer(556);
        n.offer(344);
        n.offer(32);
        System.out.println(n);

//        delete element from the queue
        System.out.println(n.poll());

        // return the head position from th queue
        System.out.println(n.peek());

    }
}

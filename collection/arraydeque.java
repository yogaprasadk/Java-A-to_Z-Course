import java.util.*;
public class arraydeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> s = new ArrayDeque<>();
//       add element in deque
        s.offer(4);
//       first
        s.offerFirst(5);
//       last
        s.offerLast(2);
//       add element in array at last
        s.offer(67);

//        it will take from first element from the array and get printed
        System.out.println(s.peek());
//        it take the first element from the array
        System.out.println(s.peekFirst());
// it take the last element from the array
        System.out.println(s.peekLast());

        // it takes the 1st element
        System.out.println(s.peek());
//        print the remaining array
        System.out.println(s);

//        it will take the 1st element from  the array and remove it
        System.out.println(s.pollFirst());
//        print the array without the first element
        System.out.println(s);
        
//     remove the last element from the array queue
        System.out.println(s.pollLast());
//        print the remaining values fom the arrays
        System.out.println(s);
    }
}

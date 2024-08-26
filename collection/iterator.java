import java.util.*;
public class iterator {
    public static void main(String[] args){
        List<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);

        Iterator <Integer> g = n.iterator();
        while(g.hasNext()){
            System.out.println(g.next());
        }

        String S = "Good Bag Ugly";
        Scanner s = new Scanner(S);
        System.out.println(s.hasNext());
        System.out.println(s.nextLine());
        System.out.println("iterator.main"+s.hasNext());
    }
}

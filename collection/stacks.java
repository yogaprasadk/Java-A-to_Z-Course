import java.util.Stack;
public class stacks
{
    public static void main(String[] args){
        Stack<String> s = new Stack<>();
//       push method
        s.push("lion");
        s.push("tiger");
        s.push("elephant");
        s.push("king");
        System.out.println(s);
//        peek and push
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
    }
}
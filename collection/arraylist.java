import java.util.ArrayList;
public class JavaArrayList {
    public static void main(String[] args){
//        add element in an empty array
        ArrayList<Integer> S = new ArrayList<>();
        S.add(1);
        S.add(2);
        S.add(3);
        S.add(4);
        S.add(5);
        S.add(6);
        System.out.println(S);
//        add value in the index position
        S.add(1,4);
        System.out.println(S);
//      add element from another array to the existing arraylist

        ArrayList<Integer> S1 = new ArrayList<>();
        S1.add(33);
        S1.add(44);
//        use addAll to add the new list with the existing arraylist
        S.addAll(S1);
        System.out.println(S);
//        to get prticular index value
        System.out.println(S.get(1));

//        to remove an element of an index from the array

          S.remove(1);
          System.out.println(S);

// to remove the number directly from the array
          S.remove(Integer.valueOf(4));
        System.out.println(S);

// to remove all the elements from the arraylist
        S.clear();
        System.out.println(S);

//        to change element in array value
        S.set(1,45);
        System.out.println(S);
//
//        to check the element is present in the given array
        System.out.println(S.contains(2));

//        looping in arraylist

//        for loop

        for(int i = 0;i<S.size();i++){
            System.out.println(S.get(i));
        }
//        foreach loop
        for(Integer l:S){
            System.out.println(l);
        }
    }
}

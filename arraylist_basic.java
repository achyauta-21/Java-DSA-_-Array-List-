
//  differernce between array and arraylist
// 1) Array is of fixed size
// 2)  primitive datatype can be stored



//  ArrayList
// 1)  dynamic size
// 2)  primitve datatype cannot be stored directly

// Declaration
// ArrayList<Integer>list1 = new ArrayList<>();
// ArrayList<String>list2 = new ArrayList<>();
// ArrayList<Boolean>list3 = new ArrayList<>();



import java.util.*;
public class arraylist_basic {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // operation to get the element
        // int element = list.get(2);
        // System.out.println(element);

        /// operation to delete
        //  list.remove(2);
        //  System.out.println(list);

         // set opeation
         list.set(2,10);
System.out.println(list);

// contains Element
System.out.println(list.contains(1));
System.out.println(list.contains(11));


System.out.println(list.size());
    }
}

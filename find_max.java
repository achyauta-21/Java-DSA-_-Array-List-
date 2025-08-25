// wap to print the maximum value of the number in the given array list
import java.util.*;
public class find_max {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

list.add(3);
list.add(6);
list.add(2);
list.add(9);
list.add(7);

int max = Integer.MIN_VALUE;
for(int i = 0;i<list.size();i++){
if(max<list.get(i)){
    max = list.get(i);
}
}
System.out.println("the max is "+max);
    }
}

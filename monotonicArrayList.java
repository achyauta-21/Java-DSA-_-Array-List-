// Monotonic ArrayList(EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.AnArraylistnumsismonotoneincreasingifforalli<=j,nums.get(i)<=nums.get(j).AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.Sample Input 1: nums = [1,2,2,3]Sample Output 1: trueSample 
// Input 2: nums = [6,5,4,4]Sample Output 2: trueSample 
// Input 3: nums = [1,3,2]Sample Output 3: false
// Constraints:●1 <= nums.size() <= 105●-105 <= nums.get(i) <= 105






import java.util.*;

public class monotonicArrayList {

 public static boolean monotonic(ArrayList<Integer>list){

     boolean increasing = true;
     boolean decreasing = true;
    for(int i = 0;i<list.size()-1;i++){
        if(list.get(i)> list.get(i+1)){
increasing  = false;
        }
        if(list.get(i)<list.get(i+1)){
            decreasing = false;
        }
    }
    return increasing||decreasing;
 }




    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
   

list.add(1);
list.add(2);
list.add(2);
list.add(3);
System.out.println(monotonic(list));
    }
}

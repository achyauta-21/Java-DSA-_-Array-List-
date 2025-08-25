// ///You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
 

// Constraints:
// /// 


import java.util.*;
public class container_with_most_water {


// function to calculate the maximum water contain

public static int maxWater(ArrayList<Integer>height){
int maxWater = 0;

    // loop to find all the pairs of the list
for(int i= 0;i<height.size();i++){
    for(int j= i+1;j<height.size();j++){
int ht = Math.min(height.get(i),height.get(j));
int width = j-i;
int currWater = ht*width;
maxWater = Math.max(currWater,maxWater);
    }
}
return maxWater;
}





    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
height.add(1);
height.add(8);
height.add(6);
height.add(2);
height.add(5);
height.add(4);
height.add(8);
height.add(3);
height.add(7);

System.out.println("the maximum water contains"+
maxWater(height));

    }
}

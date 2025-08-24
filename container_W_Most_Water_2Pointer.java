/// Wap to calculate container with most water using two pointer approach





import java.util.*;
public class container_W_Most_Water_2Pointer {

public static int height(ArrayList<Integer>height){
    int maxWater = 0;
    int lp =0;
int rp = height.size()-1;

while(lp<rp){
    int ht = Math.min(height.get(lp),height.get(rp));
int width = rp-lp;
int CurrWater = ht*width;
maxWater =Math.max(CurrWater,maxWater);


// update pointer
if(height.get(lp)<height.get(rp)){
    lp++;
}
else{
    rp--;
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

System.out.println("the max water stored is "+height(height) );


    }
    
}

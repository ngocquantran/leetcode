import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,2};

        System.out.println(lastStoneWeight(arr));




    }

    public static int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer i:stones){
            list.add(i);
        }
        return getStone(list);
    }

    public static int getStone(ArrayList<Integer> list){
        if (list.size()==1) return list.get(0);
        if (list.size()==0) return 0;
        int max= 0;
        int maxIndex=0, secondMaxIndex=0;
        int secondMax= 0;
        for (int i=0;i< list.size();i++){
            if (list.get(i)>=max){
                secondMax=max;
                secondMaxIndex=maxIndex;
                max= list.get(i);
                maxIndex=i;
            }else if(list.get(i)>secondMax){
                secondMax= list.get(i);
                secondMaxIndex=i;
            }
        }
        System.out.println(list.toString());
        System.out.println("max= "+max);
        System.out.println("secondMax= "+secondMax);

        if (max==secondMax){
            list.remove(maxIndex);
            list.remove(secondMaxIndex);
        }else {
            list.set(maxIndex,max-secondMax);
            list.remove(secondMaxIndex);
        }
        System.out.println(list.toString());
        System.out.println();
        return getStone(list);

    }


}

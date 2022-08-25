import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    static final int SIZE = 1000;
    static ArrayList<Integer> myBuckets[];

    public static void main(String[] args) {
//        MyHashSet myHashSet=new MyHashSet();
//        myHashSet.add(1);
//        myHashSet.add(1);
//        myHashSet.add(2);
        Set<Integer> mySet=new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        mySet.add(2);

        for (Integer integer:mySet){
            System.out.println(integer);
        }

    }

    MyHashSet(){
        myBuckets=new ArrayList[SIZE];
        for (int i=0;i< myBuckets.length;i++){
            myBuckets[i]=new ArrayList<>();
        }
    }

    public int hashFunction(int key){
        return key % SIZE;
    }
    public void add(int key){
        int hashValueIndex = hashFunction(key);
        var bucket=myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex<0){
            bucket.add(key);
        }
    }

    public void remove(int key){
        int hashValueIndex=hashFunction(key);
        var bucket=myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex>=0){
            bucket.remove(key);
        }


    }
}

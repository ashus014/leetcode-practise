package src.Java8Practise.randomCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code8 {

    public Code8() {
        dataStore = new HashMap<>();
        arr = null;
    }

    Map<Integer, Integer> dataStore;
    int[] arr;

    public void insertValue(int num) {
        dataStore.put(num, null);
    }

    public void removeData(int num) {
        dataStore.remove(num);
    }

    public static void main(String[] args) {

        Code8 collection1 = new Code8();
        collection1.insertValue(11);
        // collection1.removeData(11);
        System.out.println(collection1.dataStore);

        System.out.println(collection1.dataStore.keySet());
        ;
    }

}

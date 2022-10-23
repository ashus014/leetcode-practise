package src.Java8Practise.streams;

import java.util.Arrays;

public class Test1 {
    

    public static final String[] VALUES = new String[] {"AB","BC","CD","AE"};

    public static void main(String[] args) {
        
        System.out.println(Arrays.stream(VALUES).anyMatch("AE"::equals));
    }
}

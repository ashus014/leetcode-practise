package src.ashu.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        var nums = new ArrayList<>(List.of(1,2,3));

        nums.remove(1);

        System.out.println(nums);

    }
}

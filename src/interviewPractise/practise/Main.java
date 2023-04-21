package src.interviewPractise.practise;

import src.interviewPractise.bp.Node;
import src.interviewPractise.chargpt2.LRUCache;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Integer> ashu = new PriorityQueue<>(Comparator.comparingInt((Integer i) -> -i));
    ashu.add(11);
        ashu.add(33);
        ashu.add(22);
        ashu.add(44);


        ashu.poll();
        System.out.println(ashu);

    }
}

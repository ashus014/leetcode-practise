package src.ashu.arrayOperations;

import com.sun.jdi.event.ThreadStartEvent;

import java.util.*;
import java.util.stream.Stream;

public class Problem12 {

    public static void main(String[] args) {
        String name = "ashusingh";
//        findOccurences(name);

        ThisLinkedlList v1 = new ThisLinkedlList(11);
        ThisLinkedlList v2 = new ThisLinkedlList(22);
        ThisLinkedlList v3 = new ThisLinkedlList(33);
        v1.next = v2;
        v2.next = v3;


        // Stack implementation

        // push
        //1->2->3





        //pop
        //1->2


    }

    ThisLinkedlList lastIndex;
    public ThisLinkedlList push(ThisLinkedlList newElement, ThisLinkedlList head) {

        // 1->2->3   -> 4
        if (head == null) {

            ThisLinkedlList temp = new ThisLinkedlList(newElement.getValue());
            lastIndex = temp;

            return temp;
        } else {
            ThisLinkedlList temp = new ThisLinkedlList(newElement.getValue());
            head.next = temp;
            head = head.next;
            return head;
        }



    }

    public void pop(ThisLinkedlList head) {

        if(head == null) {
            System.out.println("Stack is empty");
        } else {


        }

    }




//    private static void findOccurences(String name) {
//
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i=0; i< name.length(); i++) {
//            map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);
//        }
//        System.out.println(map);
//
//        char[] charArray = name.toCharArray();
//
//    }




}

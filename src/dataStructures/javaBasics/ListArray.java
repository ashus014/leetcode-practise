package src.dataStructures.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListArray {
    

    public static void main(String[] args) {
        

       	//code
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n >= 0) {
		    
		    int tot = scan.nextInt();
		    Integer []arr = new Integer[tot];
		    for(int i=0; i<tot; i++) {
		        arr[i] = scan.nextInt();
		    }
		    
		  //  Arrays.sort(arr);
		  Collections.reverse(Arrays.asList(arr)); 
		    
		   for(int i=0; i<tot; i++) {
		        System.out.print(arr[i] + " ");
		    }
		    
		    n--;
		}
        
    }
}

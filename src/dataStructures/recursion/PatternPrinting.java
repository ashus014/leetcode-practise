package src.dataStructures.recursion;

public class PatternPrinting {
    
    public static void main(String[] args) {
        
        pattern2(4);

    }

    /*
     *  Printing below pattern
     * 
     *  * * * * 
     *  * * *
     *  * *
     *  *
     */
    public static void pattern1(int n) {

        if(n==0){
            return;
        }

        for(int i=0; i<n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern1(n-1);
    }

    /*
     *  Printing below pattern
     * 
     *  *
     *  * * 
     *  * * * 
     *  * * * * 
     */
    public static void pattern2(int n) {

        if(n==0){
            return;
        }

        pattern2(n-1);
        for(int i=0; i<n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

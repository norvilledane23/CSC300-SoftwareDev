// Norville Amao
// Simple Lambda Program
package lambdaexample;
import java.util.Scanner;

public class LambdaExample{
    interface Addable{
        int add(int a,int b);
    } 
    
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int x, y;
        
        // Interface implmented without a return statement
        Addable ad1 = (int x1, int y1) -> x1 + y1;
        // Interface implemented with a return statement
        Addable ad2 = (int x2, int y2) -> {return x2 + y2;};
        
        System.out.printf("Please enter two integers: ");
        x = scnr.nextInt();
        y = scnr.nextInt();
        System.out.printf("Without return the sum is %d\n",ad1.add(x,y));
        
        System.out.printf("Please enter two integers: ");
        x = scnr.nextInt();
        y = scnr.nextInt();
        System.out.printf("With return the sum is %d\n",ad2.add(x,y));
    }
}

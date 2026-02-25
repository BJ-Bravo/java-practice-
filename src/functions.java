import java.util.*;

public class functions {

    //Function to print/find the factorial of a number
    public static void printFactorial(int n) {    //n here is arguments
        int factorial = 1;

        if (n < 0) {
            System.out.println("Please enter a whole number.");
            return;
        }

        else {
            System.out.println("\n\tFactorial of " + n + " is ....");
            if (n == 0 || n == 1) {                   //since 1! and 0! = 1
                System.out.println(n + "! = 1");
            } else {
                System.out.print(n + "! = ");         //print n! number! say eg. 5!
                for (int i = 1; i < n; i++) {
                    System.out.print(i + "x");
                }
                System.out.print(n);                 //the above for loop and this line is just to print 5! = 1x2x3x4x5

                //for(int i=n;i>=1;i--){             //both for loop works this goes from n-1 and the other goes form 1-n
                for (int i = 1; i <= n; i++) {
                    factorial = factorial * i;
                }
                System.out.print(" = " + factorial);
                //return;                            // no need to return anything cause it is a void function and the function will stop once it fulfils the conditons
                                                     //but if it was a int, float, double,char ...function then add a return type to stop the function .
            }
        }
    }

    //main function where the factorial function will be called
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("what number factorial you want: ");
        int n = sc.nextInt();
        printFactorial(n);                                   //n here passed is called parameters.

    }
}

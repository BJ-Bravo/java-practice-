import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");//lets say you entered your full name= Bijay Chhetri
        String name = sc.next();//sc.next()=this will take one word as one token and only print that out after space another word is another token
        System.out.println("Hello "+name);//output:Hello Bijay
        sc.nextLine();//this line is to clear the buffer(temporary strorge) cause this will store Chhetri and will be used when sc.nextLine comes..remove this line and check the output
        //Remember - When mixing next(), nextInt(), etc. with nextLine() → always clear the buffer using sc.nextLine() first.

        System.out.print("Enter name: ");// you entered : Bijay Chhetri
        String another = sc.nextLine();//sc.nextLine()=this will print the whole line
        System.out.println("Hello "+ another);//output:Hello Bijay Chhetri

        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Sum = "+(a+b));
        System.out.print("Product = "+(a*b));
    }
}


import java.util.Scanner;
public class strings {
    // String are immutable - means once created you cannot change it , cannot modify or cannot update it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Bijay";
        String lastName = "Chhetri";

        //this is called String Concatenation
        //is the operation of joining two or more character strings to create a new longer string.
        System.out.println("String Concatenation :---> ");
        String fullName = firstName + " " + lastName;
        System.out.println("\t\t" + fullName);

        //length() function - length of the string or how many characters are there in the string
        //System.out.println(fullName.length());
        System.out.println(".length() :---> ");
        System.out.println("\t\tYour name contains " + fullName.length() + " letters");

        //CharAt(index) function - to get each character from the string
        System.out.println("CharAt :---> ");
        System.out.print("\t\t");
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
        System.out.print(" ...Hello ");                //just using charAt to print first letter of full name
        System.out.print(fullName.charAt(0));
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                System.out.println(fullName.charAt(i + 1));
            }
        }

        //.compareTo() = compares two strings ..it checks 3 cases 1. String1 > String2 then output will be +ve value
        System.out.println(".compareTo() :--->");               //2. s1 == s2 ..Output will be 0 (means if the output is 0 that means string are equal)
        String name1 = "Autobots";                              //3. s1 < s2 .. Output = -ve value
        String name2 = "Transform";

        String check1 = "Transform";
        String check2 = "Autobots";

        String try1 = "Equal";
        String try2 = "Equal";

        System.out.println(name1.compareTo(name2));             //you can also take input and compare using if else statement
        System.out.println(check1.compareTo(check2));           // if(s1.compareTo(s2)==0) then print equal
        System.out.println(try1.compareTo(try2));               //else if(s1.compareTo(s2)>0) then print s1 is greater
                                                                //else(s1.compareTo(s2)<0) then print s1 is smaller

        //substring(startindex, endindex) - to get a prat of a String
        System.out.println("subString() :--->");
        System.out.print("\t\t");
        String sentence = "You have came a long way Bijay. See the path ahead & keep moving.";
        System.out.println(sentence.substring(25, 30));                     // Remember - if end Index is n then the value will be printed till n-1 only
                                                                            // in this case 25-29 will be printed
        System.out.println("\t\t"+sentence.substring(53));         // if end index is not added then it will print till last index


        //Reversing a string ..just for output(in actual the String will not get changed - since immutable)
        System.out.println("Reverse a String :--->");
        String name = "Bijay";
        //System.out.print(length);
        int length = name.length();     //5
        int n = length - 1;             //5 - which means index start from 0-4
        System.out.print("\t\t");
        for(int i=n;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }



}

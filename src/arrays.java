import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Manually declaring and storing value and printing one by one
//        int marks[] = {98,92,91};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        //or
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        // taking array size input and array input and printing using for loop.
        System.out.print("What size array do you want: ");
        int n = sc.nextInt();                               // array size....say 3
        int[] arr = new int[n];                             // declaring array variable
        //int arr[]= new int[n];
        for(int i=0;i<n;i++){                               //loop for array input
            System.out.print("arr ["+i+"] = ");
            arr[i] = sc.nextInt();                          //storing input ....at [0], [1], [2]
        }
        System.out.print("Your array = [ ");                //loop to print array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]\n");

        System.out.print("Search element in your array: ");
        int search = sc.nextInt();
        boolean found = false;                              // to print element found if true and element not found if flase
        for(int i=0;i<n;i++) {
            if (search == arr[i]) {
                System.out.println("\tElement " + search + " found at index [" + i + "]");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("\tElement "+search+" is not in the array.");    //reason to do this - this will print not found only once
                                                                              // else at every index it will print element not found and element found at one place.
                                                                                    //Output:
                                                                                //            Your array = [ 1 7 3 9 ]
                                                                                //            Search element in your array: 3
                                                                                //            Element 3 is not in the array.
                                                                                //            Element 3 is not in the array.
                                                                                //                  Element 3 found at index [2]
                                                                                //            Element 3 is not in the array.
        }

    }
}

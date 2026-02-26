import java.util.*;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");             //taking rows size input
        int rows = sc.nextInt();
        System.out.print("Enter Columns: ");          //taking col size input
        int col = sc.nextInt();

        int matrix[][] = new int[rows][col];            // declaring 2d array

        //array input
        System.out.println("Enter elements in the matrix");
        for(int i=0;i<rows;i++){                        // taking input using nexted loops.
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //array output
        System.out.println("Your matrix ---->");
        for(int i=0;i<rows;i++){                        //printing 2D array using nestd loop just like printing patterns.
            for(int j=0;j<col;j++){
                System.out.print("\t"+matrix[i][j]+" ");
            }
            System.out.println("");                     // this will print rows in new line instead of printing everything in single line.
        }


        //search element in the array.
        System.out.print("Search element in the matrix: ");
        int search = sc.nextInt();
        boolean found = false;
        if(found){
            System.out.print("\tElement "+search+" found at index|\n" );                // if statement is used because if the element is not found then this line will aslo get printed so to avoid that if conditon is used ..print only if the element is found
            }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(search==matrix[i][j]){
                    //System.out.print("\tElement "+search+" found at index ["+i+"] ["+j+"]");                  //if 4 appers two times then the same line will be printed twice
                    System.out.println("\t\t\t\t\t\t\t["+i+"]["+j+"]");                                         //so to print only the index this is the line of code
                    found = true;
//                    return;                    // if we return once the found is complete then the loop will stop just where it found the element
                                                 // lets say there are two 4 repeating then when it found the first 4 the loop will stop/return  and does not look for other elements.
                                                  // so not including 'return' in the code cause once it finds the 4 it will still go through all other elements.
                }
            }

        }
        if(!found){
            System.out.println("\tElement "+search+" is not in the matrix");
        }
    }
}

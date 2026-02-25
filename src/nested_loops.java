public class nested_loops {
    public static void main(String[] args){
        //print pattern - solid rectangle - here you can see that there are 4 rows and 5 columns.
        /*  *****   a11 a12 a13 s14 a15
            *****   a21 a22 a23 a24 a25
            *****   a31 a32 a33 a34 a35
            *****   a41 a42 a43 a44 a45
        do not print(*****) and run the loop four times what if instead of 5* there are 100* in a line */
        System.out.println("----Pattern 1 Solid Rectangle-----");
        for(int i =1; i <=4;i++){  //this will give four new lines i.e 4 rows
            for(int j=1;j<=5;j++){  //when i = 1 then this will give 5 stars in one line because of print statement and when i =2 give again 5 stars in 2nd line....
                //when i=1 j starts from 1 and  runs 5 times  , when i=2 j runs 5 times, when i=3 j runs 5 times ...
                System.out.print("*");  //print will give stars is same line
            }
            System.out.println("");//println for outer loop to print stars in another line
        }//here both i and j are incrementing i gives new line 1 2 3 4 and j also gives 1 2 3 4 5 but in same line



        //print pattern - hollow rectangle
        /*  *****    a11 a12 a13 a14 a15 i=1
            *   *    a21             a25 i=2
            *   *    a31             a35 i=3
            *****    a41 a42 a43 a44 a45 i=4
                     j=1 j=2 j=3 j=4 j=5
        these patterns are like matrix --there are 4 rows and 5 columns
        you can see a pattern : when i=1 and i=4=no of rows then print the line and when j=1 and j=5=no of columns then print the line */
        System.out.println("----Pattern 2 Hollow Rectangle-----");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }


        //print pattern - half pyramid
        /*  *
            **
            ***
            ****
        */
        System.out.println("----Pattern 3 Half Pyramid-----");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //print pattern - inverted half pyramid
        /*  ****
            ***
            **
            *
        */
        System.out.println("----Pattern 4 Inverted Half Pyramid-----");
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){//print 4 stars until j is greater than or equal to i and do j= j-1
                System.out.print("*");
            }
            System.out.println("");
        }



        //print pattern - inverted half pyramid(rotate by 180 degree)
        /*      *
               **
              ***
             ****
        */
        System.out.println("----Pattern 5 Inverted Half Pyramid - 180 degree-----");
        int n =4;
        for(int i=1;i<=n;i++){//outer loop
            for(int j=1;j<=(n-i);j++) { //inner loop to print space before stars.. 1st print space
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){//inner loop to print star ..after printing space print star then return to outer loop for 2nd line ..
                System.out.print("*");
                }

            System.out.println("");
        }



        // half pyramid with numbers
        /*  1
            12
            123
            1234
            12345
        */
        System.out.println("----Pattern 6 Half Pyramid with numbers-----");
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

        // inverted half pyramid with numbers
        /*  12345
            1234
            123
            12
            1
        */
        System.out.println("----Pattern 7 inverted Half Pyramid with numbers-----");
        int m =5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=(m-i+1);j++){
                System.out.print(j);
            }
            System.out.println("");
        }



        //pattern - Floyd's Triangle
        /*  1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
        */
        System.out.println("----Pattern 8 Floyd's Triangle-----");
        int num = 1;
        for(int i=1;i<=5;i++){//this outer loop  will run 5 times to give five lines
            for(int j=1;j<=i;j++){// this inner loop will run i times to print num
                System.out.print(num);
                num++;
            }
            System.out.println("");//outer loop print statement for new line
        }


        //pattern - 0-1 Triangle
        /*  1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
        if you see this is matrix form a11, a12... then you'll see that a11(1+1) = 2 ,a22(2+2)=4, a31(3+!)=4, a33(3+3)=6 ...
        in even number place the value is 1 and odd number place value is 0          ,aij(i+j)=4  */
        System.out.println("----Pattern 9 (0-1) Triangle-----");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.println("");
        }
    }
}

public class loops {
    public static void main(String[] args){
        System.out.println("Simple for loop..printing i..");
        for(int i=0; i<=5;i++){//this means the loop will run 5 times and 'i' will start printing from 0 and will increase by 1 each time loop runs until 5
            System.out.print(i);
        }
        //run these and see the output to understand for loop
        for(int i=0;i<4;i++){//this means the loop will run 4 times and each time it will print 'Hello'
            System.out.println("Hello");
        }

        System.out.println("--------Fibonacci Sequence-------");
        System.out.println("------For Loop----->");
        //Fibonacci Sequence  is a sequence where each number is the sum of the two preceding ones, usually starting from 0 and 1.
        // The sequence begins 0,1,1,2,3,4,5,8,13,21,34...and continues infinitely.
        int first = 0;
        int second = 1;
        int n = 10;
        System.out.print(first+" ");
        System.out.print(second+" ");
        //printing first two number because to get the next number we have to do sum of previous two
        //understand the loop : here we are not printing fibonacci numbers upto 10. the loop will run 10 times and print first 10 numbers of fibonacci series
        // to print upto 10 only you can either use if condition inside for loop or use while loop
        // now 'i' is initialized from 2 because we are already printing first 2 numbers(although it will not print 0 and 1 two times if i =0)
        //when i = 2 the loop will run 8 times and 8 numbers after 0 and 1 will be printed, so total = 10 fibonacci no will be printed
        //if i = 0 the loop will run 10 times and 10 nos after 0 and 1 will be printed, so total = 12 fibonacci no will be printed
        for(int i = 2; i < n; i++) {
            int next = first + second;//next no = 0 + 1 = now next no becomes 1
            System.out.print(next+" ");//print next number
            //second = first;
            //next = second;
            first = second;//the second no becomes first now
            second = next;// and the next no becomes second now =1
            //so after this when the loop runs again
            //f s n
            //0 1 1
            //  f s n
            //  1 1 2
            //    f s n
            //    1 2 3
            //      f s n
            //      2 3 5
            //        f s n
            //        3 5 8.......
        }

        //while loop
        System.out.println("\n");
        System.out.println("------while Loop----->");
        int pelha= 0;
        int dusra= 1;
        int j =0;
        while(j<n){
            System.out.print(pelha+" ");//print current number ..(before updating)
            int agla= pelha + dusra;
            pelha = dusra;
            dusra = agla;
            j++;
        }

        //do while loop
        //this first prints and then check the condition
        //so this can be used when you want to print something atleast once for the condition may be either ture or false
        //if condition is flase then it will print once and checks condition and stops when false,, if true then prints till the condition satisfies
        System.out.println("\n");
        System.out.println("------do while Loop----->");
        int one= 0;
        int two= 1;
        int k =0;
        do{
            System.out.print(one+" ");//print current number ..(before updating)
            int Newnum= one + two;
            one = two;
            two = Newnum;
            k++;
        }while(k<n);
    }


}

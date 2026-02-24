import java.util.*;

public class CS_IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //else-if
        System.out.println("\n\tWanna know which Generation you belong to ??");
        System.out.print("Just enter your age: ");
        int age = sc.nextInt();
        int year = 2026 - age ;//to get the year of birth
        System.out.println("\t\tCongratulations!!!!!");
        if(year >= 2025 ){
            System.out.println("You belong to Gen Beta. (2025+)");
        }
        else if(year >= 2013 && year <= 2024){
            System.out.println("You belong to Gen Alpha. (2013-2024)");
        }

        else if(year >= 1997 && year <= 2012){
            System.out.println("You belong to Gen Z. (1997-2012)");
        }

        else if(year >= 1981 && year <= 1996){
            System.out.println("You belong to Millennials Generation/ Gen Y. (1981-1996)");
        }
        else if(year > 1965 && year <= 1980){
            System.out.println("You belong to Gen X. (1965-1980)");
        }

        else if(year > 1946 && year <= 1964){
            System.out.println("You belong to Baby Boomers Generation. (1946-1964)");
        }

        else if(year > 1925 && year <= 1945){
            System.out.println("You belong to Silent Generation. (1925-1945)");
        }

        else{
            System.out.println("You belong to Stone age.");
        }



        // if-else
        System.out.println("\nThis is for if-else conditional statement");
        System.out.print("Enter a number to check even or odd:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number.");
        }
        else{
            System.out.println(num+" is a odd number.");
        }



        //switch case
        System.out.println("Press 1, 2, or 3");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");//if you take char as input then it should case 'a'...case 'b'
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Khurumjari");
                break;
            default:
                System.out.println("Enter either 1, 2 or 3 only");
        }

    }
}

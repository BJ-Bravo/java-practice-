import java.util.*;

public class CS_IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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

    }
}

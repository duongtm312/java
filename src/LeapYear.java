import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }

            } else {
               isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.print(year +" is a leap year");
        } else {
            System.out.print(year+" is NOT a leap year");
        }
    }
}

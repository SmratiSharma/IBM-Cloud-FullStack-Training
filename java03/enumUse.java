package java03;

import java.time.LocalDate;
import java.util.Scanner;

enum weekend{    
    SATURDAY, SUNDAY;
}

public class enumUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Today's Date : ");
        System.out.println("Enter day in the format of DD :");
        String day = sc.nextLine();
        System.out.println("Enter month in the format of MM :");
        String month = sc.nextLine();
        System.out.println("Enter year in the format of YYYY :");
        String year = sc.nextLine();

        String date = year + "-" + month + "-" + day;
        LocalDate d = LocalDate.parse(date);

        System.out.println("Today's date is : " + d);

        LocalDate newDate = d.plusDays(30);

        String currentDay = newDate.getDayOfWeek().toString();

        if(currentDay.equals(weekend.SATURDAY.toString()) ){
            System.out.println("The Next Monday is : " + newDate.plusDays(2));
        } else if(currentDay.equals(weekend.SUNDAY.toString())){
            System.out.println("The Next Monday is : " + newDate.plusDays(1));
        } else {
            System.out.println("After 30 days is " + newDate + " and it is a "+ currentDay.toLowerCase() + ".");
        }

        sc.close();

    }
}

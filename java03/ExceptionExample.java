package java03;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a divisor: ");
        int divisor = sc.nextInt();
        try {
            System.out.println("You entered: " + num);
            System.out.println("Divisor: " + divisor);
            System.out.println("Result: " + (num / divisor));
        } catch (Exception e) {
            System.out.println("please enter a valid number and divisor. Divisor should not be zero. YOU idiot!");
        } finally {
            sc.close();
        }
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

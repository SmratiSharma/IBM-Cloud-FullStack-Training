package java01;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double price = 19.99;
        int rounded = (int) price;
        System.out.println("Rounded price: " + rounded);

        int a =5, b = 2;

        System.out.println(a * b + a % b);

        int x = 10;
        x += 5;

        x--;

        System.out.println("Value of x: " + x);

        boolean result = (7 > 3) && (10 == 5 + 4);
        System.out.println("Result: " + result);
    }
}
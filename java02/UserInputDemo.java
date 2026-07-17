package java02;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.print("Enter your age:");
        // int age = sc.nextInt();
        // System.out.print("Enter your cgpa:");
        // double cgpa = sc.nextDouble();

        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);
        // System.out.println("CGPA: " + cgpa);

        // sc.close();

        // int choice = 1;
        // switch (choice) {
        //     case 1:
        //         System.out.println("You selected option 1");
        //         break;
        //     case 2:
        //         System.out.println("You selected option 2");
        //         break;
        //     case 3:
        //         System.out.println("You selected option 3");
        //         break;
        //     default:
        //         System.out.println("Invalid choice");
        // }

        //Print a right-angle triangle pattern of stars with 5 rows using nested loops.

        for(int i = 1; i <= 5; i ++){
            for(int j = 1; j  <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Write a program that takes 5 numbers as input into an arrray and then prints the maximum and minimum sum and average.

        int[] numbers = new int[5];
        int sum = 0;    
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 5; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];

            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        double average = (double) sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        sc.close();


        //  Challenge 3 Print all prime numbers between 1 and 50. Count how many there are and display the count at the end.

        int count = 0;
        for(int i = 2; i <=50; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i %j == 0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount of prime numbers: " + count);

    }
}

package section3.lesson14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name : ");
        String name = input.nextLine();

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        System.out.print("Enter your weight : ");
        double weight = input.nextDouble();

        System.out.println("My name is " + name + ". I am " + age + " years old and my weight is " + weight);

    }
}

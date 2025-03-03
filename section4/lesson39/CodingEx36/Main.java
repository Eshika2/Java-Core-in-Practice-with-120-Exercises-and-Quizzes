package section4.lesson39.CodingEx36;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();



        Student s = new Student(name, age);

        for (int i=0; i<5; i++) {
            System.out.printf("Enter your grades %d : " , i+1);
            int g = scanner.nextInt();
            s.addGrade(g);
        }
        System.out.println(s.getDetails());
    }
}

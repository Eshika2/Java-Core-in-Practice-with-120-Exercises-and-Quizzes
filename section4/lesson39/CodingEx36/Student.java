package section4.lesson39.CodingEx36;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<Integer> grades = new ArrayList<>();

    // constructor to initialize name and age
    public Student(String name, int age) {
        // TODO: implement constructor
        this.name = name;
        this.age =  age;
    }

    // public method to add a grade
    public void addGrade(int grade) {
        // TODO: implement this method
        if ((grade > 100) || (grade < 0)) {

        }else {
            grades.add(grade);
        }
    }

    // public method to calculate the average grade
    public double getAverageGrade() {
        // TODO: implement this method
        if (grades.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }

    // public method to get the student details
    public String getDetails() {
        // TODO: implement this method
        return "Name: " + name + ", Age: " + age + ", Average Grade: " + getAverageGrade();
    }
}
//Encapsulation in Java
//You need to implement three methods in the Student class:
//
//addGrade(int grade): This method should add a grade to the grades list.
//
//The grade should be an integer between 0 and 100 (inclusive).
//
//If the grade is not within this range, it should not be added to the list.
//
//getAverageGrade(): This method should calculate and return the average of the grades in the grades list.
//
//If there are no grades, return 0.0.
//
//Use a loop to calculate the sum of the grades, then divide by the number of grades to get the average.
//
//getDetails(): This method should return a formatted string with the student's details.
//
//The string should be in the format: "Name: [name], Age: [age], Average Grade: [averageGrade]".
//
//The average grade should be calculated using the getAverageGrade method.
//
//Your task is to complete the implementation of these methods in the Student class.
// You do not need to modify the constructor.

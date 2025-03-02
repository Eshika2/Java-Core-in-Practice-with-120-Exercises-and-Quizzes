package section4.lesson36.CodingEx31;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dolly", 8, "Rot");
        dog.bark();
        dog.eat();
        dog.sleep();

        System.out.println("Name : " + dog.name);
        System.out.println("Age : " + dog.age);
        System.out.println("Breed : " + dog.getBreed());


    }
}
//Create a class Dog that extends the Animal class.
//
//Add a private attribute breed to the Dog class.
//
//Add a getter for the breed attribute (getBreed()).
//
//Implement a constructor in the Dog class that takes name, age, and breed as parameters and calls the constructor of the Animal class using super.
//
//Add a method bark to the Dog class that prints "The dog is barking".
//
//Ensure that the Dog class inherits the methods eat and sleep from the Animal class
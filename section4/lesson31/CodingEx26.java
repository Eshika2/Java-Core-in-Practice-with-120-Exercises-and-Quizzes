package section4.lesson31;

public class CodingEx26 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//Implement the getter and setter methods for the name and age fields in the Person class. The getName method should return the name field, and the setName method should set the name field. The getAge method should return the age field, and the setAge method should set the age field, ensuring that the age is not negative. If a negative age is provided, the setter should not change the age field.
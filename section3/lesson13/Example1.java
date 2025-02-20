// Writing to the console
package section3.lesson13;

public class Example1 {
    public static void main(String[] args) {
//        System.out.print("Hello Eshika");
//        System.out.print("Hello Eshika");
//        System.out.print("\n");

        //print
        int age = 21;
        float weight = 115;

        System.out.print("Age : " + age);
        System.out.print("  ");
        System.out.print("Weight : " + weight + "Kg\n");

        for (int i=0 ; i<10 ; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();


        //println
//        System.out.println("Hello Eshika");
//        System.out.println("Hello Eshika");

        for (int i=0 ; i<10 ; i++) {
            System.out.println(i);
        }


        //printf
        String name = "Eshika";
        System.out.printf("My name is %s. My age is %d. My weight is %.2f." , name, age, weight);
    }
}

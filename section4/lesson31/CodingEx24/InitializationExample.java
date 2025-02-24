package section4.lesson31.CodingEx24;

public class InitializationExample {

    int instanceVariable;
    static int staticVariable;

    // TODO: Initialize instanceVariable to 100 using initialization block
    {
        instanceVariable = 100;
    }
    // TODO: Initialize staticVariable to 200 using initialization block
    static {
        staticVariable = 200;
    }
    public static void main(String[] args) {
        InitializationExample example = new InitializationExample();
        System.out.println("Instance Variable: " + example.instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }
}

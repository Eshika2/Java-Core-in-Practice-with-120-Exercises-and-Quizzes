package section4.lesson31.CodingEx25;

public class OuterClass {
    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }

    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }

    public void displayLocalClassMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }

        // TODO: Instantiate the local inner class and call its printMessage method
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printMessage();
    }

    public static void main(String[] args) {
        // TODO: Instantiate the static nested class and call its printMessage method
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.printMessage();
        // TODO: Instantiate the outer class, then instantiate the inner class and call its printMessage method
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printMessage();
        // TODO: Call the displayLocalClassMessage method that displays the message from the local inner class
        OuterClass obj = new OuterClass();
        obj.displayLocalClassMessage();
    }
}

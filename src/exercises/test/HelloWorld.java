package exercises.test;

public class HelloWorld {

    public static void main(String[] args) {

    }

    public String message = "Hello World";

    public void sayHello() {

        String message = "Goodbye World";

        // The line below prints "Goodbye World"
        System.out.println(message);

        // The line below prints "Hello World"
        System.out.println(this.message);
    }

}

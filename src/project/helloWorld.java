package project;

public class helloWorld {
    public String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println(new helloWorld().getGreeting());
    }
}

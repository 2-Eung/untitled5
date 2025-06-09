public class Main {
    public static void greet() {
        System.out.println("Hello, World!");
    }
    public static void greet (String a) {
        System.out.println("Hello, " + a);
    }
    public static void main(String[] args) {
        greet();
        greet("Alice!");
    }
}
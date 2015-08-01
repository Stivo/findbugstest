package test.findbugstest;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        if (args == null) {
            System.out.println(args[0]);
        }
    }
}
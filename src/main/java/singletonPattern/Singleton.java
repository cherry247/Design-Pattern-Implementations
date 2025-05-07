package singletonPattern;

public class Singleton {
    public static Singleton instance = new Singleton();

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public void doSomething() {
        System.out.println("doing something with singleton instance");
    }
}

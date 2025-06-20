package templatePattern;

public class Main {
    public static void main(String[] args) {
       Input lowerCase = new LowerCase();
       Input upperCase = new UpperCase();
       lowerCase.run("Hello World");
       upperCase.run("Hello World");
    }
}

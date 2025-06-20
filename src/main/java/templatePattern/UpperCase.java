package templatePattern;

public class UpperCase extends Input{
    @Override
    public void convert(String text) {
        System.out.println("Converting text to uppercase: " + text.toUpperCase());
    }

}

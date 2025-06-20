package templatePattern;

public class LowerCase extends Input
{
    @Override
    public void convert(String text) {
        System.out.println("Converting text to lowercase: " + text.toLowerCase());
    }
}

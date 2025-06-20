package templatePattern;

public abstract class Input {
    public void run(String text){
        System.out.println("Input is running");
        enterText();
        convert(text);
    }
    public void enterText(){
        System.out.println("Entering text in input");
    }

    public abstract void convert(String text);

    public void display(){
        System.out.println("Displaying input");
    }

}

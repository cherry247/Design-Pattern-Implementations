package commandPattern;

public class RemoteControl {

    private Command command;
    public RemoteControl() {
        // No command assigned initially
    }
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        if(command!= null) {
            command.execute();
        } else {
            System.out.println("No command assigned.");
        }
    }
}

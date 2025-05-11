package commandPattern;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(livingRoomLightOn);
        remoteControl.pressButton();
        remoteControl.setCommand(livingRoomLightOff);
        remoteControl.pressButton();
    }
}

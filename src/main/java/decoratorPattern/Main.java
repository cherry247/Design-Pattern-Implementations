package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Component modelA = new ModelA();
        Component nisaanCar = new MusicSystemComponent(new AcComponent(modelA));
        System.out.println(nisaanCar.getDescription());
        System.out.println("cost of nissan car is " + nisaanCar.getCost());
    }
}

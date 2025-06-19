package adapterPattern;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("The Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println("\nThe Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

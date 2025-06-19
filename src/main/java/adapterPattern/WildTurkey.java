package adapterPattern;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("WildTurkey is gobbling");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey is flying a short distance");
    }
}

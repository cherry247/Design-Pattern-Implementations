package decoratorPattern;

public class MusicSystemComponent extends OptionalEquipments {
    public MusicSystemComponent(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Music System" ;
    }

    @Override
    public double getCost() {
        return super.getCost() + 10000;
    }
}

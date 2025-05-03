package decoratorPattern;

public class AcComponent extends OptionalEquipments {
    public AcComponent(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + AC";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5000;
    }
}

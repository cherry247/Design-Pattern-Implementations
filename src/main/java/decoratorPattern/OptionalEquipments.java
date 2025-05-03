package decoratorPattern;

public abstract class OptionalEquipments implements Component{
    public Component component;

    public OptionalEquipments(Component component) {
        this.component = component;
    }

    public String getDescription() {
        return component.getDescription();
    }
    public double getCost() {
        return component.getCost();
    }
}

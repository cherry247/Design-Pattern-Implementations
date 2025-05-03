package decoratorPattern;

public class ModelA implements Component{
    @Override
    public String getDescription() {
       return "Model A" ;
    }

    @Override
    public double getCost() {
        return 20000;
    }
}

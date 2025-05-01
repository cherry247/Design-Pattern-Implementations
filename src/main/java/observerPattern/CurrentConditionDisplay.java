package observerPattern;

public class CurrentConditionDisplay implements Observers, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherDataObject weatherDataObject;

    public CurrentConditionDisplay(WeatherDataObject weatherDataObject){
        this.weatherDataObject = weatherDataObject;
        weatherDataObject.addObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display(){
        System.out.println("Current conditions : temperature : " + temperature + " humidity : " + humidity);
    }
}

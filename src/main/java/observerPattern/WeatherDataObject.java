package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObject implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observers> observers;

    public WeatherDataObject() {
        observers = new ArrayList<Observers>();
    }

    public void addObserver(Observers observer) {
        observers.add(observer);
    }

    public void removeObserver(Observers observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observers observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChange(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
}

package observerPattern;

import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Observers, DisplayElement{

    private float avgTemp;
    private float maxTemp;
    private float minTemp;
    private List<Float> temperatureTracker;
    private WeatherDataObject weatherDataObject;

    public StatisticsDisplay(WeatherDataObject weatherDataObject){
        this.weatherDataObject = weatherDataObject;
        weatherDataObject.addObserver(this);
        temperatureTracker = new java.util.ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("AVG temp : " + avgTemp + " MAX temp : " + maxTemp + " MIN temp : " + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureTracker.add(temperature);
        avgTemp = calculateAvgTemp(temperatureTracker);
        maxTemp = Collections.max(temperatureTracker);
        minTemp = Collections.min(temperatureTracker);
        display();
    }

    private Float calculateAvgTemp(List<Float> temperatureTracker){
        float sum = 0;
        int count = temperatureTracker.size();
        for(float temp : temperatureTracker){
            sum += temp;
        }
        return sum/count;
    }
}

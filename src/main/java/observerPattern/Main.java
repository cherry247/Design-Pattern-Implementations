package observerPattern;

public class Main {
    public static void main(String[] args) {
        WeatherDataObject weatherDataObject = new WeatherDataObject();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDataObject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataObject);
        weatherDataObject.setMeasurements(80, 65, 30.4f);
        weatherDataObject.setMeasurements(20, 61, 30.4f);
    }
}

package designPatterns;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject: WeatherData
class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();  // Notify observers when the temperature changes
    }
}

// Observer interface
interface Observer {
    void update(float temperature);
}

// Concrete Observer: PhoneDisplay
class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Current Temperature: " + temperature + "°C");
    }
}

// Concrete Observer: TVDisplay
class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("TV Display: Current Temperature: " + temperature + "°C");
    }
}

// Main class
public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherData.addObserver(phoneDisplay);
        weatherData.addObserver(tvDisplay);

        weatherData.setTemperature(25.5f);  // Notify observers about the new temperature
        weatherData.setTemperature(30.0f);  // Notify observers again
    }
}


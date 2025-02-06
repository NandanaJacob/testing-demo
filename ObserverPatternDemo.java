// Observer Pattern

import java.util.ArrayList;
import java.util.List;
//Observer interface
interface Observer {
void update(float temperature);
}

//Subject (Observable) interface
interface Subject {
void addObserver(Observer observer);
void removeObserver(Observer observer);
void notifyObservers();
}
//Concrete Subject (Observable)
class WeatherStation implements Subject {
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

// Method to update temperature and notify observers
public void setTemperature(float temperature) {
 this.temperature = temperature;
 notifyObservers();
}
}
//Concrete Observer
class DisplayDevice implements Observer {
private String name;

public DisplayDevice(String name) {
 this.name = name;
}

@Override
public void update(float temperature) {
 System.out.println(name + " received temperature update: " + temperature + "°C");
}
}
public class ObserverPatternDemo {
public static void main(String[] args) {
 WeatherStation weatherStation = new WeatherStation();

 // Create Observers
 DisplayDevice phoneDisplay = new DisplayDevice("Phone Display");
 DisplayDevice tvDisplay = new DisplayDevice("TV Display");

 // Attach Observers
 weatherStation.addObserver(phoneDisplay);
 weatherStation.addObserver(tvDisplay);

 // Change temperature (Observers will be notified)
 System.out.println("\nSetting temperature to 25°C...");
 weatherStation.setTemperature(25);

 // Remove an observer and update temperature
 System.out.println("\nRemoving TV Display observer...");
 weatherStation.removeObserver(tvDisplay);

 System.out.println("\nSetting temperature to 30°C...");
 weatherStation.setTemperature(30);
}
}
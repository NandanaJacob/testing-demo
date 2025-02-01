package mod8;

public class car{
    private String model;
    private Engine engine;
    private Dashboard dashboard;
    
    // Static nested class - represents a general engine blueprint
    public static class Engine {
        private String type;
        private int horsepower;
        
        public Engine(String type, int horsepower) {
            this.type = type;
            this.horsepower = horsepower;
        }
        
        public void start() {
            System.out.println(type + " engine starting... Vroom!");
        }
        
        public String getType() {
            return type;
        }
        
        public int getHorsepower() {
            return horsepower;
        }
    }
    
    // Non-static nested class (Inner class) - can access car's instance variables
    public class Dashboard {
        private boolean engineLightOn;
        
        public void checkEngine() {
            // Can access enclosing class's members (engine)
            if (engine.getHorsepower() > 500) {
                engineLightOn = true;
                System.out.println("Warning: High performance engine detected!");
            } else {
                engineLightOn = false;
                System.out.println("Engine status: Normal");
            }
        }
        
        public boolean isEngineLightOn() {
            return engineLightOn;
        }
    }
    
    public car(String model, String engineType, int horsepower) {
        this.model = model;
        this.engine = new Engine(engineType, horsepower);
        this.dashboard = new Dashboard();
    }
    
    public void startCar() {
        engine.start();
        dashboard.checkEngine();
    }
    
    public static void main(String[] args) {
        // Create a regular car
        car familyCar = new car("Toyota", "V6", 300);
        familyCar.startCar();
        
        // Create a sports car
        car sportsCar = new car("Ferrari", "V8", 600);
        sportsCar.startCar();
        
        // Creating engine directly (static nested class)
        car.Engine newEngine = new car.Engine("V12", 700);
        
        // Creating dashboard (non-static nested class)
        car luxuryCar = new car("Mercedes", "V8", 400);
        car.Dashboard luxuryDash = luxuryCar.new Dashboard();
        luxuryDash.checkEngine();
    }
}
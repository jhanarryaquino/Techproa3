class Motorcycle {
    private String make;
    private String color;
    private boolean engineRunning;

    // Constructor
    public Motorcycle(String make, String color) {
        this.make = make;
        this.color = color;
        this.engineRunning = false; // Initialize engine state
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void showAtts() {
        System.out.println("Make: " + getMake());
        System.out.println("Color: " + getColor());
        System.out.println("Engine running: " + (isEngineRunning() ? "Yes" : "No"));
    }

    public void startEngine() {
        if (isEngineRunning()) {
            System.out.println("Engine is already running.");
        } else {
            engineRunning = true;
            System.out.println("Engine started.");
        }
    }

    public void stopEngine() {
        if (isEngineRunning()) {
            engineRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    public static void main(String[] args) {
        Motorcycle myMotorcycle = new Motorcycle("Yamaha RZ350", "yellow");

        System.out.println("---Initial State---");
        myMotorcycle.showAtts();

        System.out.println("\n---Starting Engine---");
        myMotorcycle.startEngine();
        myMotorcycle.showAtts();

        System.out.println("\n---Stopping Engine---");
        myMotorcycle.stopEngine();
        myMotorcycle.showAtts();

        System.out.println("\n---Changing Color---");
        myMotorcycle.setColor("red");
        myMotorcycle.showAtts();
    }
              }

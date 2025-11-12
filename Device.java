public class Device extends Tech {
    private String architectureType;
    private boolean hasCellular;

    //non paramatarized constructor
    public Device() {
        this.architectureType = "";
        this.hasCellular = false;
    }

    //paramatarized constructor 1
    public Device(String name, String color, String brand, int yearMade, double price, String type, String architectureType, boolean hasCellular) {
        super(name, color, brand, yearMade, price, type);
        this.architectureType = architectureType;
        this.hasCellular = hasCellular;
    }

    //paramatarized constructor 2
    public Device(String name, String color, String brand, int year, double price, String type, String architectureType) {
        super(name, color, brand, year, price, type);
        this.architectureType = architectureType;
    }
    
    //getter
    public String getArchitectureType() {
        return architectureType;
    }

    //setter
    public void setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
    }

    //getter
    public Boolean getHasCellular() {
        return hasCellular;
    }

    //setter
    public void setHasBattery(Boolean hasBattery) {
        this.hasCellular = hasBattery;
    }

    //to string method
    @Override
    public String toString() {
        return "Device " + super.toString() + "\nArchitecture Type: " + getArchitectureType() + "\nHas Cellular: " + getHasCellular();
    }
}
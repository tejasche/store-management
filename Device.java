public class Device extends Tech {
    private String architectureType;
    private boolean hasBattery;

    //non paramatarized constructor
    public Device() {
        this.architectureType = "";
        this.hasBattery = false;
    }

    //paramatarized constructor 1
    public Device(String color, String brand, int yearMade, double price, String architectureType, boolean hasBattery) {
        super(color, brand, yearMade, price);
        this.architectureType = architectureType;
        this.hasBattery = hasBattery;
    }

    //paramatarized constructor 2
    public Device(String name, String brand, int year, double price, String architectureType) {
        super(name, brand, year, price);
        this.architectureType = architectureType;
    }
    
    //getter for architecture
    public String getArchitectureType() {
        return architectureType;
    }

    //setter for architecture
    public void setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
    }

    //getter for hasBattery
    public Boolean getHasBattery() {
        return hasBattery;
    }

    //setter for hasBattery
    public void setHasBattery(Boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArchitecture Type: " + getArchitectureType() + "\nHas Battery: " + getHasBattery();
    }
}
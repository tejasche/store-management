public class Peripheral extends Tech {
    private String connectionType;
    private boolean hasBattery;

    //non parameterized constructor
    public Peripheral() {
        this.connectionType = "";
        this.hasBattery = false;
    }
    //parameterized contructor 1
     public Peripheral(String name, String color, String brand, int yearMade, double price, String type, String connectionType, boolean hasBattery) {
        super(name, color, brand, yearMade, price, type);
        this.connectionType = connectionType;
        this.hasBattery = hasBattery;
    }
    //parameterized constructor 2
    public Peripheral(String name, String color, String brand, int yearMade, double price, String type, String connectionType) {
        super(name, color, brand, yearMade, price, type);
        this.connectionType = connectionType;
    }

    //getter
    public String getConnectionType() {
        return connectionType;
    }

    //setter
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    //getter
    public boolean getHasBattery() {
        return hasBattery;
    }

    //getter
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    
    //to string method
    @Override
    public String toString() {
        return "Peripheral " + super.toString() + "\nConnection Type: " + getConnectionType() + "\nHas Battery: " + getHasBattery();
    }
}
public class Peripheral extends Tech {
    private String connectionType;
    private boolean hasBattery;

    // non parameterized constructor
    public Peripheral() {
        this.connectionType = "";
        this.hasBattery = false;
    }
    //parameterized contructor
     public Peripheral(String color, String brand, int yearMade, double price, String connectionType, boolean hasBattery) {
        super(color, brand, yearMade, price);
        this.connectionType = connectionType;
        this.hasBattery = hasBattery;
    }
    // parameterized constructor
    public Peripheral(String connectionType, boolean hasBattery) {
        this.connectionType = connectionType;
        this.hasBattery = hasBattery;
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
    
    //To string method
    @Override
    public String toString() {
        return super.toString() + "\nConnection Type: " + getConnectionType() + "\nHas Battery: " + getHasBattery();
    }
}

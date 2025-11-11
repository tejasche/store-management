public class Peripheral extends Tech {
    private String peripheralType;

    // non parameterized constructor
    public Peripheral() {
        this.peripheralType = "";
    }

    // parameterized constructor
    public Peripheral(String color, String brand, int yearMade, double price, String peripheralType) {
        super(color, brand, yearMade, price);
        this.peripheralType = peripheralType;
    }

    //getter
    public String getPeripheralType() {
        return peripheralType;
    }

    //setter
    public void setPeripheralType(String peripheralType) {
        this.peripheralType = peripheralType;
    }
    
    //To string method
    @Override
    public String toString() {
        return super.toString() + "\nPeripheral Type: " + this.peripheralType;
    }
}

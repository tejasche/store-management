public class Peripheral extends Tech {
    private String peripheralType;

    // non parameterized constructer
    public Peripheral() {
        this.peripheralType = "";
      
    }

    // parameterized constructer
    public Peripheral(String color , String brand , int yearMade , double price , String peripharelType) {
        super(color , brand , yearMade , price );
        this.peripheralType = peripharelType;

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
    public String toString() {
        return super.toString() + "\nPeripheral Type: " + this.peripheralType;
    }
}

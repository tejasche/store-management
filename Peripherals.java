public class Peripherals extends Tech {
    private String peripharelType;

    // non parameterized constructer
    public Peripherals() {
        this.peripharelType = "regular";
      
    }

    // parameterized constructer
    public Peripherals(String color , String brand , int yearMade , double price , String peripharelType) {
        super(color , brand , yearMade , price );
        this.peripharelType = peripharelType;

    }

    //getter
    public String getPeripharelType() {
        return peripharelType;
    }

    //setter
    public void setPeripharelType(String peripharelType) {
        this.peripharelType = peripharelType;
    }
}

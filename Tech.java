public class Tech {
    private String name;
    private String color;
    private String brand;
    private int yearMade;
    private double price;
    private String type;

    public Tech() {
        this.name = "";
        this.color = "";
        this.brand = "";
        this.yearMade = 0;
        this.price = 0.0;
        this.type = "";
    }

    public Tech(String name, String color, String brand, int yearMade, double price, String type) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.yearMade = yearMade;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearMade() {
        return yearMade;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.name = type;
    }
 

    @Override
    public String toString() {
        return "\nName:" + getName() + "\nColor: " + getColor() + "\nBrand: " + getBrand() + "\nYear Made: " + getYearMade() + "\nPrice: " + getPrice() + "\nType: " + getType();
    }
}

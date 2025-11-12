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

    public void setName(String newName) {
        this.name = newName;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setYearMade(int newYearMade) {
        this.yearMade = newYearMade;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setType(String newType) {
        this.name = newType;
    }
 

    @Override
    public String toString() {
        return "\nName:" + getName() + "\nColor: " + getColor() + "\nBrand: " + getBrand() + "\nYear Made: " + getYearMade() + "\nPrice: " + getPrice() + "\nType: " + getType();
    }
}

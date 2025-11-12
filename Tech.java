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

    @Override
    public String toString() {
        return "Color: " + getColor() + "\nBrand: " + getBrand() + "\nYear Made: " + getYearMade() + "\nPrice: " + getPrice();
    }
}

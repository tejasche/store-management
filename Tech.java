public class Tech {
    private String color;
    private String brand;
    private int yearMade;
    private double price;

    public Tech() {
        this.color = "gray";
        this.brand = "apple";
        this.yearMade = 0;
        this.price = 0.0;
    }

    public Tech(String color, String brand, int yearMade, double price) {
        this.color = color;
        this.brand = brand;
        this.yearMade = yearMade;
        this.price = price;
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
        return "Color:" + getColor() + "\nBrand: " + getBrand() + "\nYear Made: " + getYearMade() + "\nPrice: " + getPrice();
    }
}

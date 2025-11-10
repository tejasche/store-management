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
    
}

public class Device extends Tech {
    private String architectureType;
    private boolean hasCellular;

    public Device() {
        this.architectureType = "";
        this.hasCellular = false; 
    }



    public Device(String color, String brand, int yearMade, double price, String architectureType, boolean hasCellular) {
        super(color, brand, yearMade, price);
        this.architectureType = architectureType;
        this.hasCellular = hasCellular;
    }
    
    public Device(String architectureType, boolean hasCellular) {
        
        this.architectureType = architectureType;
        this.hasCellular = hasCellular;
    }

    public Device(Boolean hasCellular) {
        this.hasCellular = hasCellular;
    }
    
    public String getArchitectureType() {
        return architectureType;
    }

    public void setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
    }

    public Boolean getHasCellular() {
        return hasCellular;
    }

    public void setHasCellular(Boolean newHasCellular) {
        this.hasCellular = newHasCellular;
    }
}
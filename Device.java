public class Device extends Tech {
    private String deviceType;
    private boolean hasCellular;

    public Device() {
        this.deviceType = "";
    }

    public Device() {
        this.hasCellular = "False";
    }


    public Device(String deviceType) {
        this.deviceType = deviceType;
    }

    public Device(Boolean hasCellular) {
        this.hasCellular = hasCellular;
    }
    
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String newDeviceType) {
        this.deviceType = newDeviceType;
    }

    public Boolean getHasCellular() {
        return hasCellular;
    }

    public void setHasCellular(Boolean newHasCellular) {
        this.hasCellular = newHasCellular;
    }
}
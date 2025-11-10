public class Device extends Tech {
    private String deviceType;

    public Device() {
        this.deviceType = "";
    }

    public Device(String deviceType) {
        this.deviceType = deviceType;
    }
    
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String newDeviceType) {
        this.deviceType = newDeviceType;
    }
}
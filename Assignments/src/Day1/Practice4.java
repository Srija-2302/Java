package Day1;

interface Logger {
    void log(int deviceId);
}

interface SecureTransaction {
    void activateDevice();
}

class DeviceStatus {
    void showStatus(String status) {
        System.out.println("Device Status: " + status);
    }
}

class SmartHomeDevice extends DeviceStatus implements Logger, SecureTransaction {
    public void activateDevice() {
        System.out.println("Device activated securely.");
    }

    public void log(int deviceId) {
        System.out.println("Operating Device ID: " + deviceId);
    }
}

public class Practice4 {
    public static void main(String[] args) {
        SmartHomeDevice device = new SmartHomeDevice();
        device.log(7890);
        device.showStatus("Fan is ON at Speed 3");
        device.activateDevice();
    }
}
// Abstract class
abstract class SmartDevice {
    String deviceName;
    int powerUsage;

    SmartDevice(String deviceName, int powerUsage) {
        this.deviceName = deviceName;
        this.powerUsage = powerUsage;
    }

    abstract void turnOn();
    abstract void turnOff();

    void deviceInfo() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power Usage: " + powerUsage + "W");
    }
}

// Interface 1
interface Controllable {
    void remoteAccess();
    void scheduleTask();
}

// Interface 2
interface VoiceAssistantCompatible {
    void integrateWithAssistant(String assistantName);
}

// SmartBulb class
class SmartBulb extends SmartDevice implements Controllable, VoiceAssistantCompatible {
    int brightnessLevel;

    SmartBulb(String name, int power, int brightnessLevel) {
        super(name, power);
        this.brightnessLevel = brightnessLevel;
    }

    @Override
    void turnOn() {
        System.out.println(deviceName + " is now ON.");
    }

    @Override
    void turnOff() {
        System.out.println(deviceName + " is now OFF.");
    }

    @Override
    public void remoteAccess() {
        System.out.println("Controlling " + deviceName + " remotely.");
    }

    @Override
    public void scheduleTask() {
        System.out.println("Scheduling a task for " + deviceName + ".");
    }

    @Override
    public void integrateWithAssistant(String assistantName) {
        System.out.println(deviceName + " integrated with " + assistantName + ".");
    }

    @Override
    void deviceInfo() {
        super.deviceInfo();
        System.out.println("Brightness Level: " + brightnessLevel + "%");
    }
}

// SmartFan class
class SmartFan extends SmartDevice implements Controllable, VoiceAssistantCompatible {
    int speedLevel;

    SmartFan(String name, int power, int speedLevel) {
        super(name, power);
        this.speedLevel = speedLevel;
    }

    @Override
    void turnOn() {
        System.out.println(deviceName + " is now ON.");
    }

    @Override
    void turnOff() {
        System.out.println(deviceName + " is now OFF.");
    }

    @Override
    public void remoteAccess() {
        System.out.println("Controlling " + deviceName + " remotely.");
    }

    @Override
    public void scheduleTask() {
        System.out.println("Scheduling a task for " + deviceName + ".");
    }

    @Override
    public void integrateWithAssistant(String assistantName) {
        System.out.println(deviceName + " integrated with " + assistantName + ".");
    }

    @Override
    void deviceInfo() {
        super.deviceInfo();
        System.out.println("Speed Level: " + speedLevel);
    }
}

// Main class
public class SmartHome {
    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb("Philips Hue", 10, 75);
        SmartFan fan = new SmartFan("Dyson Smart Fan", 60, 3);

        SmartDevice[] devices = {bulb, fan};

        for (SmartDevice device : devices) {
            System.out.println("\n=== Device Details ===");
            device.deviceInfo();
            device.turnOn();

            if (device instanceof Controllable) {
                ((Controllable) device).remoteAccess();
                ((Controllable) device).scheduleTask();
            }

            if (device instanceof VoiceAssistantCompatible) {
                ((VoiceAssistantCompatible) device).integrateWithAssistant("Alexa");
            }

            device.turnOff();
        }
    }
}

import java.util.*;

// Base abstract class
abstract class Device {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        showStatus();
    }

    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " is now OFF.");
    }

    public boolean isOn() {
        return isOn;
    }

    public abstract void showStatus();

    // Static method to control devices
    public static void controlDevices(List<Device> devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) d.turnOn();
            else d.turnOff();
        }
    }

    // Static method to count powered-on devices
    public static int countPoweredOn(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}

// Air Conditioner class
class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("AirConditioner ON | Fan Speed: " + fanSpeed + ", Temperature: " + temperature + "°C");
        } else {
            System.out.println("AirConditioner is OFF.");
        }
    }
}

// Lamp Shade class
class LampShade extends Device {
    private int brightness;
    private String color;

    public LampShade(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }

    // Copy constructor
    public LampShade(LampShade other) {
        this.brightness = other.brightness;
        this.color = other.color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }

    public void setColor(String color) {
        this.color = color;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("LampShade ON | Brightness: " + brightness + "%, Color: " + color);
        } else {
            System.out.println("LampShade is OFF.");
        }
    }
}

// Television class
class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        this.channel = 1;
        this.volume = 10;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Television ON | Channel: " + channel + ", Volume: " + volume + "%");
        } else {
            System.out.println("Television is OFF.");
        }
    }
}

// Microwave class
class Microwave extends Device {
    private int timer;
    private int temperature;

    public Microwave() {
        this.timer = 0;
        this.temperature = 100;
    }

    public void setTimer(int timer) {
        this.timer = timer;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Microwave ON | Timer: " + timer + " mins, Temperature: " + temperature + "°C");
        } else {
            System.out.println("Microwave is OFF.");
        }
    }
}

// Main program
public class SmartHomeSystemMain {
    public static void main(String[] args) {
        // Create devices
        AirConditioner ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1); // copy constructor
        Television tv = new Television();
        Microwave mw = new Microwave();

        // Store devices in a list (polymorphism)
        List<Device> devices = Arrays.asList(ac, lamp1, lamp2, tv, mw);

        // Turn all devices ON
        System.out.println("\n--- Turning ON all devices ---");
        Device.controlDevices(devices, true);

        // Turn all devices OFF
        System.out.println("\n--- Turning OFF all devices ---");
        Device.controlDevices(devices, false);

        // Count powered-on devices
        System.out.println("\n--- Checking powered-on devices ---");
        Device.controlDevices(devices, true); // turn them on again
        int poweredOnCount = Device.countPoweredOn(devices);
        System.out.println("Number of devices powered ON: " + poweredOnCount);
    }
}

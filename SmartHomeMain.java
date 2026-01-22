//꧁──────ஓ 𝑺𝒎𝒂𝒓𝒕 𝑯𝒐𝒎𝒆 𝑪𝒐𝒏𝒕𝒓𝒐𝒍 𝑺𝒚𝒔𝒕𝒆𝒎 ஓ──────꧂

import java.util.*;

// 𝙋𝙖𝙧𝙚𝙣𝙩 𝘾𝙡𝙖𝙨𝙨 𝘿𝙚𝙫𝙞𝙘𝙚
abstract class Device {
    // powerStatus is protected so subclasses can access it
    protected boolean powerStatus;

    // Constructor: all devices start turned OFF by default
    public Device() {
        this.powerStatus = false;
    }

    // This method turns the device ON or OFF
    // I used static so it can be called even without creating a Device instance
    public static void powerDevices(List<Device> devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) {
                d.turnOn();
            } else {
                d.turnOff();
            }
        }
    }

    // This method counts how many devices are currently ON
    // Static is used again so no object is required to call it
    public static int countPoweredOnDevices(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.powerStatus) {
                count++;
            }
        }
        return count;
    }

    // Abstract methods force each device to have its own implementation
    public abstract void turnOn();
    public abstract void turnOff();
}

// Subclass AirConditioner
class AirConditioner extends Device {
    // I made the attributes private to apply encapsulation
    private int fanSpeed;
    private int temperature;

    // Default constructor with required default values
    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    // Setters print the device status after changing values
    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    // Overridden method: device-specific power ON behavior
    @Override
    public void turnOn() {
        powerStatus = true;
        System.out.println("Air Conditioner is ON");
        showStatus();
    }

    // Overridden method: device-specific power OFF behavior
    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Air Conditioner is OFF");
    }

    // Helper method to display current settings
    private void showStatus() {
        if (powerStatus) {
            System.out.println("Fan Speed: " + fanSpeed + ", Temperature: " + temperature + "°C");
        }
    }
}

// =========================
// LAMP SHADE CLASS
// =========================
class LampShade extends Device {
    private int brightness;
    private String lightColor;

    // Constructor with parameters
    public LampShade(int brightness, String lightColor) {
        this.brightness = brightness;
        this.lightColor = lightColor;
    }

    // Copy constructor (copies another LampShade)
    public LampShade(LampShade other) {
        this.brightness = other.brightness;
        this.lightColor = other.lightColor;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
        showStatus();
    }

    @Override
    public void turnOn() {
        powerStatus = true;
        System.out.println("Lamp Shade is ON");
        showStatus();
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Lamp Shade is OFF");
    }

    private void showStatus() {
        if (powerStatus) {
            System.out.println("Brightness: " + brightness + "% , Color: " + lightColor);
        }
    }
}

// =========================
// TELEVISION CLASS
// =========================
class Television extends Device {
    private int channel;
    private int volume;

    public Television(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
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
    public void turnOn() {
        powerStatus = true;
        System.out.println("Television is ON");
        showStatus();
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Television is OFF");
    }

    private void showStatus() {
        if (powerStatus) {
            System.out.println("Channel: " + channel + ", Volume: " + volume + "%");
        }
    }
}

// =========================
// MICROWAVE CLASS
// =========================
class Microwave extends Device {
    private int timer;
    private int temperature;

    // Default constructor
    public Microwave() {
        this.timer = 0;
        this.temperature = 0;
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
    public void turnOn() {
        powerStatus = true;
        System.out.println("Microwave is ON");
        showStatus();
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Microwave is OFF");
    }

    private void showStatus() {
        if (powerStatus) {
            System.out.println("Timer: " + timer + " mins, Temperature: " + temperature + "°C");
        }
    }
}

// Main Class SmartHomeMain
public class SmartHomeMain {
    public static void main(String[] args) {

        // Creating device objects as required
        Device ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1); // copy constructor
        Device tv = new Television(1, 10);
        Device microwave = new Microwave();

        // Using a parent-type list to demonstrate polymorphism
        List<Device> devices = new ArrayList<>();
        devices.add(ac);
        devices.add(lamp1);
        devices.add(lamp2);
        devices.add(tv);
        devices.add(microwave);

        // Turning all devices ON using static method
        Device.powerDevices(devices, true);

        // Counting powered ON devices
        System.out.println("Devices currently ON: " + Device.countPoweredOnDevices(devices));

        // Turning all devices OFF
        Device.powerDevices(devices, false);

        // Counting powered ON devices again
        System.out.println("Devices currently ON: " + Device.countPoweredOnDevices(devices));
    }
}

// Text style generated using: https://boldtext.online/
// Text art sourced from: https://emojicombos.com/book-text-art
// Line art sourced from: https://emojicombos.com/border

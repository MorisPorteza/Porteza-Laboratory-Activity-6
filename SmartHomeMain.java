// ꧁──────ஓ 𝑺𝒎𝒂𝒓𝒕 𝑯𝒐𝒎𝒆 𝑪𝒐𝒏𝒕𝒓𝒐𝒍 𝑺𝒚𝒔𝒕𝒆𝒎 ஓ──────꧂

import java.util.*;

// ༻☽⊱⋆𝙋𝙖𝙧𝙚𝙣𝙩 𝘾𝙡𝙖𝙨𝙨 𝘿𝙚𝙫𝙞𝙘𝙚⋆⊰☾༺
abstract class Device {
    // 𝙥𝙤𝙬𝙚𝙧𝙎𝙩𝙖𝙩𝙪𝙨 𝙞𝙨 𝙥𝙧𝙤𝙩𝙚𝙘𝙩𝙚𝙙 𝙨𝙤 𝙨𝙪𝙗𝙘𝙡𝙖𝙨𝙨𝙚𝙨 𝙘𝙖𝙣 𝙖𝙘𝙘𝙚𝙨𝙨 𝙞𝙩
    protected boolean powerStatus;

    // 𝘾𝙤𝙣𝙨𝙩𝙧𝙪𝙘𝙩𝙤𝙧: 𝙖𝙡𝙡 𝙙𝙚𝙫𝙞𝙘𝙚𝙨 𝙨𝙩𝙖𝙧𝙩 𝙩𝙪𝙧𝙣𝙚𝙙 𝙊𝙁𝙁 𝙗𝙮 𝙙𝙚𝙛𝙖𝙪𝙡𝙩
    public Device() {
        this.powerStatus = false;
    }

    // 𝙏𝙝𝙞𝙨 𝙢𝙚𝙩𝙝𝙤𝙙 𝙩𝙪𝙧𝙣𝙨 𝙩𝙝𝙚 𝙙𝙚𝙫𝙞𝙘𝙚 𝙊𝙉 𝙤𝙧 𝙊𝙁𝙁
    // 𝙎𝙩𝙖𝙩𝙞𝙘 𝙞𝙨 𝙪𝙨𝙚𝙙 𝙨𝙤 𝙞𝙩 𝙘𝙖𝙣 𝙗𝙚 𝙘𝙖𝙡𝙡𝙚𝙙 𝙚𝙫𝙚𝙣 𝙬𝙞𝙩𝙝𝙤𝙪𝙩 𝙘𝙧𝙚𝙖𝙩𝙞𝙣𝙜 𝙖 𝘿𝙚𝙫𝙞𝙘𝙚 𝙞𝙣𝙨𝙩𝙖𝙣𝙘𝙚
    public static void powerDevices(List<Device> devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) {
                d.turnOn();
            } else {
                d.turnOff();
            }
        }
    }

    // 𝙏𝙝𝙞𝙨 𝙢𝙚𝙩𝙝𝙤𝙙 𝙘𝙤𝙪𝙣𝙩𝙨 𝙝𝙤𝙬 𝙢𝙖𝙣𝙮 𝙙𝙚𝙫𝙞𝙘𝙚𝙨 𝙖𝙧𝙚 𝙘𝙪𝙧𝙧𝙚𝙣𝙩𝙡𝙮 𝙊𝙉
    // 𝙎𝙩𝙖𝙩𝙞𝙘 𝙞𝙨 𝙪𝙨𝙚𝙙 𝙖𝙜𝙖𝙞𝙣 𝙨𝙤 𝙣𝙤 𝙤𝙗𝙟𝙚𝙘𝙩 𝙞𝙨 𝙧𝙚𝙦𝙪𝙞𝙧𝙚𝙙 𝙩𝙤 𝙘𝙖𝙡𝙡 𝙞𝙩
    public static int countPoweredOnDevices(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.powerStatus) {
                count++;
            }
        }
        return count;
    }

    // 𝘼𝙗𝙨𝙩𝙧𝙖𝙘𝙩 𝙢𝙚𝙩𝙝𝙤𝙙𝙨 𝙛𝙤𝙧𝙘𝙚 𝙚𝙖𝙘𝙝 𝙙𝙚𝙫𝙞𝙘𝙚 𝙩𝙤 𝙝𝙖𝙫𝙚 𝙞𝙩𝙨 𝙤𝙬𝙣 𝙞𝙢𝙥𝙡𝙚𝙢𝙚𝙣𝙩𝙖𝙩𝙞𝙤𝙣
    public abstract void turnOn();
    public abstract void turnOff();
}

// ༻☽⊱⋆𝙎𝙪𝙗𝙘𝙡𝙖𝙨𝙨 𝘼𝙞𝙧𝘾𝙤𝙣𝙙𝙞𝙩𝙞𝙤𝙣𝙚𝙧⋆⊰☾༺ 
class AirConditioner extends Device {
    // 𝙏𝙝𝙚 𝙖𝙩𝙩𝙧𝙞𝙗𝙪𝙩𝙚𝙨 𝙖𝙧𝙚 𝙥𝙧𝙞𝙫𝙖𝙩𝙚 𝙩𝙤 𝙖𝙥𝙥𝙡𝙮 𝙚𝙣𝙘𝙖𝙥𝙨𝙪𝙡𝙖𝙩𝙞𝙤𝙣
    private int fanSpeed;
    private int temperature;

    // 𝘿𝙚𝙛𝙖𝙪𝙡𝙩 𝙘𝙤𝙣𝙨𝙩𝙧𝙪𝙘𝙩𝙤𝙧 𝙬𝙞𝙩𝙝 𝙧𝙚𝙦𝙪𝙞𝙧𝙚𝙙 𝙙𝙚𝙛𝙖𝙪𝙡𝙩 𝙫𝙖𝙡𝙪𝙚𝙨
    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    // 𝙎𝙚𝙩𝙩𝙚𝙧𝙨 𝙥𝙧𝙞𝙣𝙩 𝙩𝙝𝙚 𝙙𝙚𝙫𝙞𝙘𝙚 𝙨𝙩𝙖𝙩𝙪𝙨 𝙖𝙛𝙩𝙚𝙧 𝙘𝙝𝙖𝙣𝙜𝙞𝙣𝙜 𝙫𝙖𝙡𝙪𝙚𝙨
    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    // 𝙊𝙫𝙚𝙧𝙧𝙞𝙙𝙙𝙚𝙣 𝙢𝙚𝙩𝙝𝙤𝙙: 𝙙𝙚𝙫𝙞𝙘𝙚-𝙨𝙥𝙚𝙘𝙞𝙛𝙞𝙘 𝙥𝙤𝙬𝙚𝙧 𝙊𝙉 𝙗𝙚𝙝𝙖𝙫𝙞𝙤𝙧
    @Override
    public void turnOn() {
        powerStatus = true;
        System.out.println("Air Conditioner is 𝑶𝑵");
        showStatus();
    }

    // 𝙊𝙫𝙚𝙧𝙧𝙞𝙙𝙙𝙚𝙣 𝙢𝙚𝙩𝙝𝙤𝙙: 𝙙𝙚𝙫𝙞𝙘𝙚-𝙨𝙥𝙚𝙘𝙞𝙛𝙞𝙘 𝙥𝙤𝙬𝙚𝙧 𝙊𝙁𝙁 𝙗𝙚𝙝𝙖𝙫𝙞𝙤𝙧
    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Air Conditioner is 𝑶𝑭𝑭");
    }

    // 𝙃𝙚𝙡𝙥𝙚𝙧 𝙢𝙚𝙩𝙝𝙤𝙙 𝙩𝙤 𝙙𝙞𝙨𝙥𝙡𝙖𝙮 𝙘𝙪𝙧𝙧𝙚𝙣𝙩 𝙨𝙚𝙩𝙩𝙞𝙣𝙜𝙨
    private void showStatus() {
        if (powerStatus) {
            System.out.println("Fan Speed: " + fanSpeed + ", Temperature: " + temperature + "°C");
        }
    }
}

// ༻☽⊱⋆𝙎𝙪𝙗𝙘𝙡𝙖𝙨𝙨 𝙇𝙖𝙢𝙥𝙎𝙝𝙖𝙙𝙚⋆⊰☾༺ 
class LampShade extends Device {
    private int brightness;
    private String lightColor;

    // 𝘾𝙤𝙣𝙨𝙩𝙧𝙪𝙘𝙩𝙤𝙧 𝙬𝙞𝙩𝙝 𝙥𝙖𝙧𝙖𝙢𝙚𝙩𝙚𝙧𝙨
    public LampShade(int brightness, String lightColor) {
        this.brightness = brightness;
        this.lightColor = lightColor;
    }

    // 𝘾𝙤𝙥𝙮 𝙘𝙤𝙣𝙨𝙩𝙧𝙪𝙘𝙩𝙤𝙧 (𝙘𝙤𝙥𝙞𝙚𝙨 𝙖𝙣𝙤𝙩𝙝𝙚𝙧 𝙇𝙖𝙢𝙥𝙎𝙝𝙖𝙙𝙚)
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
        System.out.println("Lamp Shade is 𝑶𝑵");
        showStatus();
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Lamp Shade is 𝑶𝑭𝑭");
    }

    private void showStatus() {
        if (powerStatus) {
            System.out.println("Brightness: " + brightness + "% , Color: " + lightColor);
        }
    }
}

// ༻☽⊱⋆𝙎𝙪𝙗𝙘𝙡𝙖𝙨𝙨 𝙏𝙚𝙡𝙚𝙫𝙞𝙨𝙞𝙤𝙣⋆⊰☾༺ 
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
        System.out.println("Television is 𝙊𝙉");
        showStatus();
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Television is 𝙊𝙁𝙁");
    }

    private void showStatus() {
        if (powerStatus) {
            System.out.println("Channel: " + channel + ", Volume: " + volume + "%");
        }
    }
}

// ༻☽⊱⋆𝙎𝙪𝙗𝙘𝙡𝙖𝙨𝙨 𝙈𝙞𝙘𝙧𝙤𝙬𝙖𝙫𝙚⋆⊰☾༺
class Microwave extends Device {
    private int timer;
    private int temperature;

    // 𝘿𝙚𝙛𝙖𝙪𝙡𝙩 𝙘𝙤𝙣𝙨𝙩𝙧𝙪𝙘𝙩𝙤𝙧
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
        System.out.println("Microwave is 𝑶𝑵");
        showStatus();
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Microwave is 𝙊𝙁𝙁");
    }

    private void showStatus() {
        if (powerStatus) {
            System.out.println("Timer: " + timer + " mins, Temperature: " + temperature + "°C");
        }
    }
}

// ༻☽⊱⋆𝙈𝙖𝙞𝙣 𝘾𝙡𝙖𝙨𝙨 𝙎𝙢𝙖𝙧𝙩𝙃𝙤𝙢𝙚𝙈𝙖𝙞𝙣⋆⊰☾༺
public class SmartHomeMain {
    public static void main(String[] args) {

        System.out.println("▄▀▄▀▄▀▄ 𝐏𝐨𝐫𝐭𝐞𝐳𝐚'𝐬 𝐒𝐦𝐚𝐫𝐭 𝐇𝐨𝐦𝐞 𝐂𝐨𝐧𝐭𝐫𝐨𝐥 𝐒𝐲𝐬𝐭𝐞𝐦 ▄▀▄▀▄▀▄");

        System.out.println();
        
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠎⠁⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⡤⢋⣀⡄⣀⡀⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⣠⣄⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠠⠋⢳⠸⣩⠟⠁⠙⢦⡀⠀⡷⠄⠀⠀⠀⠀⢀⠞⠁⠈⢣⡀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⡰⠋⢸⡴⠃⠀⠀⠀⠀⠓⡆⣧⡀⠀⣠⠖⡤⠋⠀⣠⢧⡀⠙⣆⠀");
        System.out.println("⠀⠀⠀⡠⠊⠀⣠⠏⠀⣤⣤⣤⡤⢤⣄⠙⢧⣑⡜⣁⣀⠈⢳⡴⠃⠀⠳⣄⠈⢧");
        System.out.println("⠀⣀⢞⠁⢀⡶⠧⠤⠂⣇⣀⣟⣇⣸⢹⡇⠀⠹⣄⣷⣾⣁⣏⣙⣦⣤⣄⣈⢾⡀");
        System.out.println("⠐⠃⢸⠀⠐⡷⠀⠀⠀⣇⣀⣇⣇⣸⣸⡄⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⡇⠀⢸⠁");
        System.out.println("⠀⠀⢸⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢸⡏⢹⡏⠉⡏⠀⢸⠀");
        System.out.println("⠀⠀⢸⠀⠀⣇⠀⠀⡟⣿⠉⢩⡇⠀⢹⢹⢹⠃⢸⠀⠀⠈⣗⣺⡒⠒⣷⠀⢸⠀");
        System.out.println("⠀⠀⢸⡉⠉⣿⠀⠀⡟⣿⠂⢸⡇⠀⢸⣿⣽⣆⡸⠀⠀⣀⣉⣉⣉⣉⣹⠀⢸⠀");
        System.out.println("⠀⢀⡇⠀⢘⡟⠒⡿⠋⠙⠉⠿⡉⠉⠉⠉⠉⠉⢩⠿⠙⠷⢶⣆⣀⣰⠚⠏⠛⡆");
        System.out.println("⢀⣈⡛⠓⠋⠀⠘⡅⠀⠀⠀⠀⠙⢦⣀⠀⠀⠀⠈⠶⠳⠤⠚⠀⢀⠏⣠⣖⣾⡇");
        System.out.println("⣮⣍⢹⠀⠀⢀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠓⠒⠦⡄⠀⠀⠙⠒⢻⣿⣠⢇");
        System.out.println("⠓⠚⠃⠀⡞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣄⠀⠀⠀⠀⠓⠋⠁");

        System.out.println();

        // 𝘾𝙧𝙚𝙖𝙩𝙞𝙣𝙜 𝙙𝙚𝙫𝙞𝙘𝙚 𝙤𝙗𝙟𝙚𝙘𝙩𝙨 𝙖𝙨 𝙧𝙚𝙦𝙪𝙞𝙧𝙚𝙙
        Device ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1); // 𝙘𝙤𝙥𝙮 𝙘𝙤𝙣𝙨𝙩𝙧𝙪𝙘𝙩𝙤𝙧
        Device tv = new Television(1, 10);
        Device microwave = new Microwave();

        // 𝙐𝙨𝙞𝙣𝙜 𝙖 𝙥𝙖𝙧𝙚𝙣𝙩-𝙩𝙮𝙥𝙚 𝙡𝙞𝙨𝙩 𝙩𝙤 𝙙𝙚𝙢𝙤𝙣𝙨𝙩𝙧𝙖𝙩𝙚 𝙥𝙤𝙡𝙮𝙢𝙤𝙧𝙥𝙝𝙞𝙨𝙢
        List<Device> devices = new ArrayList<>();
        devices.add(ac);
        devices.add(lamp1);
        devices.add(lamp2);
        devices.add(tv);
        devices.add(microwave);

        // 𝙏𝙪𝙧𝙣𝙞𝙣𝙜 𝙖𝙡𝙡 𝙙𝙚𝙫𝙞𝙘𝙚𝙨 𝙊𝙉 𝙪𝙨𝙞𝙣𝙜 𝙨𝙩𝙖𝙩𝙞𝙘 𝙢𝙚𝙩𝙝𝙤𝙙
        Device.powerDevices(devices, true);

        // 𝘾𝙤𝙪𝙣𝙩𝙞𝙣𝙜 𝙥𝙤𝙬𝙚𝙧𝙚𝙙 𝙊𝙉 𝙙𝙚𝙫𝙞𝙘𝙚𝙨
        System.out.println("𝑵𝒖𝒎𝒃𝒆𝒓 𝒐𝒇 𝑫𝒆𝒗𝒊𝒄𝒆𝒔 𝒄𝒖𝒓𝒓𝒆𝒏𝒕𝒍𝒚 𝑶𝑵: " + Device.countPoweredOnDevices(devices));

        // 𝙏𝙪𝙧𝙣𝙞𝙣𝙜 𝙖𝙡𝙡 𝙙𝙚𝙫𝙞𝙘𝙚𝙨 𝙊𝙁𝙁
        Device.powerDevices(devices, false);

        // 𝘾𝙤𝙪𝙣𝙩𝙞𝙣𝙜 𝙥𝙤𝙬𝙚𝙧𝙚𝙙 𝙊𝙉 𝙙𝙚𝙫𝙞𝙘𝙚𝙨 𝙖𝙜𝙖𝙞𝙣
        System.out.println("𝑵𝒖𝒎𝒃𝒆𝒓 𝒐𝒇 𝑫𝒆𝒗𝒊𝒄𝒆𝒔 𝒄𝒖𝒓𝒓𝒆𝒏𝒕𝒍𝒚 𝑶𝑵: " + Device.countPoweredOnDevices(devices));
    }
}

// Submitted by: Porteza, Moris L. (BSCS-2D)

// AI Model: GPT-5 (ChatGPT)

// AI Prompt:
// You are hired as a junior Java developer by Smartify PH, a tech startup that builds smart home systems.
// Your task is to design a simplified Smart Home Management System that models different devices and their interactions.
// The system should use object-oriented programming principles to represent multiple smart devices inside a home,
// all of which can be powered on or off and report their current status.
// A common parent device class should be created to define shared behaviors,
// while specific devices such as an air conditioner, lamp shade, television, and microwave oven
// should be implemented as subclasses with their own unique attributes and behaviors.
// Each subclass must override methods from the parent class to demonstrate different implementations of the same behavior,
// enabling runtime polymorphism through dynamic binding.
// All device attributes should be properly encapsulated using private access modifiers,
// with setter methods that automatically display the updated device status when changes occur.
// The system should also demonstrate the use of polymorphic references
// by storing different device objects in a collection of the parent type.
// Additionally, static methods at the device level should be implemented
// to turn all devices on or off without requiring an instance
// and to count how many devices are currently powered on.
// After generating the complete Java implementation,
// provide a clear and beginner-friendly explanation summarizing the object-oriented programming concepts used in the system,
// including encapsulation, inheritance, method overriding, polymorphism, and dynamic binding.

// Transaction ID: https://chatgpt.com/share/6972d902-c940-800b-9f0a-c983b38401fd

// Text style generated using: https://boldtext.online/
// Text art sourced from: https://emojicombos.com/home
// Line art sourced from: https://emojicombos.com/border

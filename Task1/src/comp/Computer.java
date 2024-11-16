package comp;

import comp.CPU.CPU;
import comp.DISC.HardDrive;
import comp.KEYBOARD.Keyboard;
import comp.RAM.RAM;
import comp.SCREEN.Screen;

public class Computer {
    private final String vendor;
    private final String name;

    private CPU processor;
    private RAM memory;
    private HardDrive disc;
    private Screen monitor;
    private Keyboard keyboard;

    public Computer(String vendor,
                    String name,
                    CPU processor,
                    RAM memory,
                    HardDrive disc,
                    Screen monitor,
                    Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.disc = disc;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getProcessor() {
        return processor;
    }

    public void setProcessor(CPU processor) {
        this.processor = processor;
    }

    public RAM getMemory() {
        return memory;
    }

    public void setMemory(RAM memory) {
        this.memory = memory;
    }

    public HardDrive getDisc() {
        return disc;
    }

    public void setDisc(HardDrive disc) {
        this.disc = disc;
    }

    public Screen getMonitor() {
        return monitor;
    }

    public void setMonitor(Screen monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double calculationOfTotalMass() {
        return processor.getWeight() + memory.getWeight() + disc.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", memory=" + memory +
                ", disc=" + disc +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                '}';
    }
}

import comp.*;
import comp.CPU.CPU;
import comp.CPU.Frequency;
import comp.CPU.Manufacturer;
import comp.CPU.NumberOfCores;
import comp.DISC.HardDrive;
import comp.DISC.TypeHardDrive;
import comp.KEYBOARD.Keyboard;
import comp.KEYBOARD.PresenceOfBacklight;
import comp.KEYBOARD.TypeKeyboard;
import comp.RAM.RAM;
import comp.RAM.TypeRAM;
import comp.SCREEN.Screen;
import comp.SCREEN.TypeScreen;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(Frequency.THREE_THOUSAND_ONE_HUNDRED, NumberOfCores.SEVEN, Manufacturer.INTEL, 500);
        RAM memory = new RAM(TypeRAM.DDR4,16000,300);
        HardDrive disc = new HardDrive(TypeHardDrive.SSD,100000,200);
        Screen monitor = new Screen(23.9, TypeScreen.IPS,1000);
        Keyboard keyboard = new Keyboard(TypeKeyboard.MECHANICAL, PresenceOfBacklight.RGB,700);

        Computer computer = new Computer("INTEL","I9-14600K",cpu,memory,disc,monitor,keyboard);
        System.out.println(computer);
        System.out.println(computer.calculationOfTotalMass());
    }
}
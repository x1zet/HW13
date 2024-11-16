package comp.RAM;

public class RAM {
    private TypeRAM type;
    private int volume;
    private double weight;

    public RAM(TypeRAM type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}

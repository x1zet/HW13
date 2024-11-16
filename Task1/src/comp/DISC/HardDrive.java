package comp.DISC;

public class HardDrive {
    private TypeHardDrive type;
    private int memoryCapacity;
    private double weight;

    public HardDrive(TypeHardDrive type, int memoryCapacity, double weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type='" + type + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                ", weight=" + weight +
                '}';
    }
}

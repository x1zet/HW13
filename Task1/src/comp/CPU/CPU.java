package comp.CPU;

public class CPU {
    private Frequency frequency;
    private NumberOfCores numberOfCores;
    private Manufacturer manufacturer;
    private double weight;

    public CPU(Frequency frequency, NumberOfCores numberOfCores, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
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
        return "CPU{" +
                "frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                '}';
    }
}

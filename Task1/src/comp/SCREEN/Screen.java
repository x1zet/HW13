package comp.SCREEN;

public class Screen {
    private double diagonal;
    private TypeScreen type;
    private double weight;

    public Screen(double diagonal, TypeScreen type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
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
        return "Screen{" +
                "diagonal=" + diagonal +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}

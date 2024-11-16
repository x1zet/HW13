package comp.KEYBOARD;

public class Keyboard {
    private TypeKeyboard type;
    private PresenceOfBacklight presenceOfBacklight;
    private double weight;

    public Keyboard(TypeKeyboard type, PresenceOfBacklight presenceOfBacklight, double weight) {
        this.type = type;
        this.presenceOfBacklight = presenceOfBacklight;
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
        return "Keyboard{" +
                "type='" + type + '\'' +
                ", presenceOfBacklight='" + presenceOfBacklight + '\'' +
                ", weight=" + weight +
                '}';
    }
}

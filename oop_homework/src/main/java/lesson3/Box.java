package lesson3;

public class Box {

    private final int weight;

    public Box (int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" + weight + "}";
    }
}

package core.Gardens;

public class Garden {
    private int carrotWeight;

    public Garden(int carrotWeights) {
        this.carrotWeight = carrotWeights;
    }

    public Integer getCarrotWeight() {
        return carrotWeight;
    }

    @Override
    public String toString() {
        return "Garden(carrotWeight = " + carrotWeight + "кг)";
    }
}

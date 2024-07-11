package core.Animals;

import core.Gardens.Garden;

import java.lang.reflect.Array;

public class Rabbit {
    private String name;
    private Integer bag;
    private Integer maxWeight;
    private Integer totalTrips;

    public Rabbit(String name, int maxWeight, int totalTrips) {
        this.name = name;
        this.bag = 0;
        this.maxWeight = maxWeight;
        this.totalTrips = totalTrips;
    }

    public void collect(Garden[] gardens) {
        int totalCollectedWeight = bag;

        for (int trip = 0; trip < totalTrips; trip++) {
            int remainingWeight = maxWeight;
            //Располагаем грядки в порядке убывания
            sortGardens(gardens);
            for (int i = 0; i < gardens.length; i++) {
                remainingWeight -= gardens[i].getCarrotWeight();

            }
        }


    }

    private void sortGardens(Garden[] gardens) {
        Garden temp = new Garden(0);
        for (int i = 0; i < gardens.length - 1; i++) {
            for (int j = 0; j < gardens.length - i - 1; j++) {
                if (gardens[j + 1].getCarrotWeight() > gardens[j].getCarrotWeight()) {
                    temp = gardens[j];
                    gardens[j] = gardens[j + 1];
                    gardens[j + 1] = temp;
                }
            }
        }

    }
}

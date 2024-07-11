package easy;

import java.util.ArrayList;

public class asySolution {
    public static void main(String[] args) {
        ArrayList<Integer> gardens = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gardens.set(i, i);
        }
        int currentWeight;
        int maxWeight = 5;
        int maxTrips = 10;
        int collect;

        for (int i = 0; i < gardens.length - 1; i++) {
            for (int j = 0; j < gardens.length - i - 1; j++) {
                if (gardens[j + 1].getCarrotWeight() > gardens[j].getCarrotWeight()) {
                    temp = gardens[j];
                    gardens[j] = gardens[j + 1];
                    gardens[j + 1] = temp;
                }
            }
        }

        for (int trips = 0; trips < maxTrips; trips++) {

        }
    }
}

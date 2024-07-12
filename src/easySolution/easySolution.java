package easySolution;

import java.util.ArrayList;

public class easySolution {
    public static void main(String[] args) {
        ArrayList<Integer> gardens = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gardens.add(i + 1);
        }
        int currentWeight;
        int maxWeight = 5;
        int maxTrips = 10;
        int collect = 0;

        int temp;
        for (int i = 0; i < gardens.size() - 1; i++) {
            for (int j = 0; j < gardens.size() - i - 1; j++) {
                if (gardens.get(j + 1) > gardens.get(j)) {
                    temp = gardens.get(j);
                    gardens.set(j, gardens.get(j + 1));
                    gardens.set(j + 1, temp);
                }
            }
        }
        for (int trips = 1; trips < maxTrips; trips++) {
            if (!gardens.isEmpty()) {
                currentWeight = gardens.get(0);
                if (currentWeight != maxWeight) {
                    for (int l = gardens.size() - 1; l > 0; l--) {
                        if (currentWeight + gardens.get(l) == maxWeight) {
                            collect += currentWeight + gardens.get(l);
                            gardens.remove(l);
                            gardens.remove(0);
                            break;
                        }
                    }
                } else {
                    collect += currentWeight;
                    gardens.remove(0);
                }
            } else {
                trips -= 1;
                System.out.println("Все полянки пустые. Кролик собрал " + collect + "кг моркови за " + trips + " ходки");
                break;
            }
        }
    }
}

package ulit;

import core.Animals.Rabbit;
import core.Gardens.Garden;

import java.util.ArrayList;

public class Runner {
    public static void run(){
        Rabbit rabbit = new Rabbit("Tobby", 5, 10);
        ArrayList<Garden> gardens = new ArrayList<>();
        for (int i = 1; i < 6; i++){
            gardens.add(new Garden(i));
        }
        System.out.println(gardens);

        rabbit.collect(gardens);
        rabbit.rabbitBag();

    }
}

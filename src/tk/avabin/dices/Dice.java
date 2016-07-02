package tk.avabin.dices;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Avabin on 30.05.2016.
 */
public abstract class Dice {
    private Random rand;
    private int numberOfSides, minValue, maxValue;
    private ArrayList<DiceSide> sides;

    public Dice(int numberOfSides,int minValue, int maxValue) {
        this.numberOfSides = numberOfSides;
        this.minValue = minValue;
        this.maxValue = maxValue;
        sides = new ArrayList<>(numberOfSides);
        rand = new Random();

        int step = maxValue / numberOfSides;
        for (int i = 0; i < numberOfSides; i += step) {
            sides.add(new DiceSide(minValue + (step * i)));
        }

    }

    public int nextThrow() {
        return sides.get(rand.nextInt(numberOfSides)).getValue();
    }
}

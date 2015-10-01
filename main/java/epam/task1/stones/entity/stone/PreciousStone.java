package epam.task1.stones.entity.stone;

import epam.task1.stones.enums.Color;
import epam.task1.stones.enums.PreciousStoneType;

/**
 * Created by Rashid on 17.08.2015.
 */
public class PreciousStone extends Stone {

    private PreciousStoneType name;

    public PreciousStone() {
        super();
    }

    public PreciousStone(double weight, double price, Color color, PreciousStoneType name) {
        super(weight, price, color);
        this.name = name;
    }

    public PreciousStoneType getName() {
        return name;
    }

    public void setName(PreciousStoneType name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "\nPreciousStone{" +
                "name = " + this.getName() +
                ", color = " + this.getColor() +
                ", weight = " +  String.format("%8.3f",this.getWeight()) +
                ", price = " +  String.format("%8.2f",this.getPrice()) +
                '}';
    }
}

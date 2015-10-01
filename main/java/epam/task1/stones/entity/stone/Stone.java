package epam.task1.stones.entity.stone;

import epam.task1.stones.enums.Color;

/**
 * Created by Rashid on 17.08.2015.
 */
public abstract class Stone {
    private double weight;
    private double price;
    private Color color;

    public Stone(){

    }

    public Stone(double weight, double price, Color color) {
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nStone{" +
                "color= " + color +
                ", weight= " + String.format("%8.3f",weight) +
                ", price= " + String.format("%8.2f",price) +
                '}';
    }
}

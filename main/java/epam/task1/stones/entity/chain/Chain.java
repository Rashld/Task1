package epam.task1.stones.entity.chain;

import epam.task1.stones.enums.ChainType;
import epam.task1.stones.enums.Fineness;

/**
 * Created by Rashid on 17.08.2015.
 */
public class Chain {

    private ChainType material;
    private double cost;
    private Fineness fineness;

    public Chain(){

    }

    public Chain(ChainType material, double cost, Fineness fineness) {
        super();
        this.material = material;
        this.cost = cost;
        this.fineness = fineness;
    }

    public ChainType getMaterial() {
        return material;
    }

    public void setMaterial(ChainType material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Fineness getFineness() {
        return fineness;
    }

    public void setFineness(Fineness fineness) {
        this.fineness = fineness;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "material = " + this.getMaterial() +
                ", cost = " +  String.format("%8.3f",this.getCost()) +
                ", fineness = " + this.getFineness() +
                '}';
    }
}

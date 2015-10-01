package epam.task1.stones.entity;

import epam.task1.stones.entity.chain.Chain;
import epam.task1.stones.entity.stone.Stone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rashid on 17.08.2015.
 */
public class Necklace {

    private List<Stone> stonesList = new ArrayList<Stone>();
    private Chain chain;

    public Necklace() {
    }

    public List<Stone> getStonesList() {
        return stonesList;
    }

    public void setStonesList(List<Stone> stonesList) {
        this.stonesList = stonesList;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    @Override
    public String toString() {
        return "\nNecklace{" +
                "chain = " + chain +
                ", stonesList = " + stonesList +
                '}';
    }
}

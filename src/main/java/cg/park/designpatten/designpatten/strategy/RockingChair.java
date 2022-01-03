package cg.park.designpatten.designpatten.strategy;

public class RockingChair extends Chair {
    public RockingChair() {
        moves = new MovingChair();
        sounds = new RockingChairSound();
    }
}

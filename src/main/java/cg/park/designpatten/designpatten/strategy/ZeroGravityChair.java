package cg.park.designpatten.designpatten.strategy;

public class ZeroGravityChair extends Chair {
    public ZeroGravityChair() {
        moves = new MovingChair();
        sounds = new ZeroGravityChairSound();
    }
}

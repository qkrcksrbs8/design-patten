package cg.park.designpatten.designpatten.strategy;

public class OfficeChair extends Chair {
    public OfficeChair() {
        moves = new dontMovingChair();
        sounds = new OfficeChairSound();
    }
}

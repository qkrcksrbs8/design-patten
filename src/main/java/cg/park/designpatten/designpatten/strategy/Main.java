package cg.park.designpatten.designpatten.strategy;

public class Main {
    public static void main(String[] args) {
        Chair chair = new ZeroGravityChair();
        chair.eventMoves();
        chair.eventSounds();

        chair.setMoves(new dontMovingChair());
        chair.setSounds(new OfficeChairSound());
        chair.eventMoves();
        chair.eventSounds();

    }
}

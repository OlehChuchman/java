package Lesson5;

public class SpaceXN3 extends SpaceXN2 {
    public boolean isDrivingoffroad = true;


    public SpaceXN3(int year, int maxSpeed, boolean isDiving, int quantityofoxigen, boolean isDrivingoffroad) {
        super(year, maxSpeed, isDiving, quantityofoxigen);
        this.isDrivingoffroad = isDrivingoffroad;

    }
}

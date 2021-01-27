package Lesson5;

public class SpaceXN2 extends SpaceX {
    public boolean isDiving = true;
    public int quantityofoxigen;

    public SpaceXN2(int year, int maxSpeed, boolean isDiving, int quantityofoxigen) {
        super(year, maxSpeed);
        this.isDiving = isDiving;
        this.quantityofoxigen = quantityofoxigen;

    }
}

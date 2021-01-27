package les7;

public class lion implements mammal {
    @Override
    public String getName() {
        return "Alex";
    }
    @Override
    public void feed() {
        System.out.println(" I love meat so much");
    }

}

package les7;

public class zebra implements mammal {
    @Override
    public String getName() {
        return "Marty";
    }

    @Override
    public void feed() {
        System.out.println("Omnomnom");
    }

}

package les7;

public class zoo {
    public static void main(String[] args){
        mammal alex = new lion();
        mammal marty = new zebra();
        worker feeder = new worker(alex);
        worker feeder2 = new worker(marty);
        feeder.feedmammal();
        feeder2.feedmammal();



    }
}

package les7;

public class worker {
    private final mammal mammal;

    public worker(mammal mammal) {
        this.mammal = mammal;
    }

        public void feedmammal () {
            System.out.println("Worker is feeding " + mammal.getName());
            mammal.feed();

        }

    }

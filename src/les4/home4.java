package les4;

class Main {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int minMethodInt(int x, int y) {
        return x - y;
    }

    static double minMethodDouble(double x, double y) {
        return x - y;
    }

    static int delenMethodInt(int x, int y) {
        return x/y;
    }

    static double delenMethodDouble(double x, double y) {
        return x/y;
    }

    static int vermenigvuldigingMethodInt(int x, int y) {
        return x*y;
    }

    static double vermenigvoldigingMethodDouble(double x, double y) {
        return x*y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        int myNum3 = minMethodInt(8, 5);
        double myNum4 = minMethodDouble(9.3, 6.26);
        int myNum5 = delenMethodInt(8, 4);
        double myNum6 = delenMethodDouble(4.4, 0.2);
        int myNum7 = vermenigvuldigingMethodInt(8, 5);
        double myNum8 = vermenigvoldigingMethodDouble(5.9, 7);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("int: " + myNum3);
        System.out.println("double: " + myNum4);
        System.out.println("int: " + myNum5);
        System.out.println("double: " + myNum6);
        System.out.println("int: " + myNum7);
        System.out.println("double: " + myNum8);
    }}
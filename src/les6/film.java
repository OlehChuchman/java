package les6;

import java.util.Scanner;

public class film {
    private static film3 film3;

    public static void main(String[] args) {
        film film = new film();
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println(" 1. Show seats \n 2. Book seat \n 3. Exit");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    film3.showSeatScheme();
                    break;
                case 2:
                    System.out.println("Please input seat number: ");
                    int inputSeat = in.nextInt();
                    boolean success = film3.bookSeat(inputSeat);
                    if (success) {
                        System.out.println(inputSeat + "booked successfully");
                    } else {
                        System.out.println("Seat taken");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Thank you so much");
                    break;
            }
        }

    }
}
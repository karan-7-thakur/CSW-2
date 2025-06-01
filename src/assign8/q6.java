package assign8;

class BookMyShow {
    int availSeats;

    public BookMyShow(int availSeats) {
        this.availSeats = availSeats;
    }

    public void bookSeat(int seats) {
        System.out.println(Thread.currentThread().getName() + " is in Queue");

        // makes only one Thread use this at a time
        synchronized (this) {
            if (availSeats >= seats) {
                availSeats -= seats;
                System.out.println(Thread.currentThread().getName() + " Booked " + seats + " Seats");

            } else {
                System.out.println(Thread.currentThread().getName() + "Not enough seats");
            }
        }
    }

}

public class q6 {
    public static void main(String[] args) {
        BookMyShow app = new BookMyShow(10);

        Thread[] customers = new Thread[4];
        customers[0] = new Thread(() -> app.bookSeat(5), "customer 1");
        customers[1] = new Thread(() -> app.bookSeat(10), "customer 2");
        customers[2] = new Thread(() -> app.bookSeat(4), "customer 3");
        customers[3] = new Thread(() -> app.bookSeat(5), "customer 4");

        for (Thread thread : customers) {
            thread.start();
        }
    }
}

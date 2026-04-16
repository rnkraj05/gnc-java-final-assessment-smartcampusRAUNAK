// Using Thread to simulate enrollment processing
// sleep() is used to create delay
// start() method creates a new thread

// Thread class to simulate enrollment processing
class EnrollmentThread extends Thread {

    public void run() {

        System.out.println("Processing enrollment...");

        try {
            // simulate delay (2 seconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }

        System.out.println("Enrollment completed successfully!");
    }
}

public class TestThread {
    public static void main(String[] args) {

        // Create thread object
        EnrollmentThread t1 = new EnrollmentThread();

        // Start thread
        t1.start();

        System.out.println("Main program continues...");

         /*
        Author - RAUNAK
        */
    }
}
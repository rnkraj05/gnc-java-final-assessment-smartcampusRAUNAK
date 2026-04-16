import java.util.*;

class InvalidFeeException extends Exception {
    public InvalidFeeException(String msg) {
        super(msg);
    }
}

class Course {
    int id;
    String name;
    double fee;

    Course(int id, String name, double fee) throws InvalidFeeException {
        if (fee < 0) {
            throw new InvalidFeeException("Fee cannot be negative!");
        }
        this.id = id;
        this.name = name;
        this.fee = fee;
    }
}

public class TestExceptionHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Fee: ");
            double fee = sc.nextDouble();

            Course c = new Course(id, name, fee);

            System.out.println("Course Created Successfully!");

        } catch (InvalidFeeException e) {
            System.out.println("Custom Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Enter correct data type.");

        } catch (Exception e) {
            System.out.println("General Error occurred.");
        }

        /*
        Author - RAUNAK
        */
    }
}
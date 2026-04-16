import java.util.*;

class Course {

    int courseId;
    String courseName;
    double fee;

    public Course(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }
}

class EnrollmentSystem {

    // Using HashMap to map studentId to list of courses
    // ArrayList is used because one student can enroll in multiple courses

    // Map: studentId → list of courses
    HashMap<Integer, ArrayList<Course>> enrollments = new HashMap<>();

    // Enroll student into course
    void enrollStudent(int studentId, Course course) {

        // student is present
        enrollments.putIfAbsent(studentId, new ArrayList<>());

        // added the course
        enrollments.get(studentId).add(course);

        System.out.println("Student " + studentId + " enrolled in " + course.courseName);
    }

    // View enrollments details
    void viewEnrollments() {

        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found!");
            return;
        }

        for (int id : enrollments.keySet()) {

            System.out.println("Student ID: " + id);

            for (Course c : enrollments.get(id)) {
                System.out.println("  -> " + c.courseName);
            }
        }
    }
}

public class Enrollment {
    public static void main(String[] args) {

         //Create a Object creation 
        EnrollmentSystem es = new EnrollmentSystem();

        // assign the values
        Course c1 = new Course(11, "Java Concept", 10000);
        Course c2 = new Course(12, "Python with GenAi", 5000);

        // Display the enrollment details
        es.enrollStudent(1, c1);
        es.enrollStudent(1, c2);

        es.viewEnrollments();

        /*
        Author - RAUNAK
        */
    }
}
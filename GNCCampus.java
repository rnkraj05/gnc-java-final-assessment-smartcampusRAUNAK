import java.util.*;

// Step 1: Create a Student Class with id, name and email
class Student {
    int studentId;
    String name;
    String email;

    Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return studentId + " " + name + " " + email;
    }
}

// Step 2: Create a Course Class with id, name, fee.
class Course {
    int courseId;
    String courseName;
    double fee;

    Course(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    public String toString() {
        return courseId + " " + courseName + " " + fee;
    }
}

// Step 3: Create a Enrollment System class .
class EnrollmentSystem {

    // studentId → Student object
    HashMap<Integer, Student> students = new HashMap<>();

    // courseId → Course object
    HashMap<Integer, Course> courses = new HashMap<>();

    // studentId → list of courses
    HashMap<Integer, ArrayList<Course>> enrollments = new HashMap<>();

    // Add A Student
    void addStudent(Student s) {
        students.put(s.studentId, s);
        System.out.println("Student Added!");
    }

    // Add A Course
    void addCourse(Course c) {
        courses.put(c.courseId, c);
        System.out.println("Course Added!");
    }

    // Enroll Student
    void enroll(int sid, int cid) {

        if (!students.containsKey(sid) || !courses.containsKey(cid)) {
            System.out.println("Invalid student or course!");
            return;
        }

        enrollments.putIfAbsent(sid, new ArrayList<>());
        enrollments.get(sid).add(courses.get(cid));

        System.out.println("Enrollment successful!");
    }

    // Display Students Details
    void viewStudents() {
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    // Display Enrollments Details
    void viewEnrollments() {
        for (int id : enrollments.keySet()) {
            System.out.println("Student ID: " + id);
            for (Course c : enrollments.get(id)) {
                System.out.println("  -> " + c.courseName);
            }
        }
    }
}

// Step 4: Create a Thread class
class EnrollmentThread extends Thread {
    public void run() {
        System.out.println("Processing enrollment...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println("Enrollment Done!");
    }
}

//  MAIN class GNCCampus 
public class GNCCampus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EnrollmentSystem es = new EnrollmentSystem();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Process Enrollment (Thread)");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    es.addStudent(new Student(sid, name, email));
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Fee: ");
                    double fee = sc.nextDouble();

                    es.addCourse(new Course(cid, cname, fee));
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int sId = sc.nextInt();
                    System.out.print("Enter Course ID: ");
                    int cId = sc.nextInt();

                    es.enroll(sId, cId);
                    break;

                case 4:
                    es.viewStudents();
                    break;

                case 5:
                    es.viewEnrollments();
                    break;

                case 6:
                    new EnrollmentThread().start();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");

                     /*
                      Author - RAUNAK
                     */
            }
        }
    }
}
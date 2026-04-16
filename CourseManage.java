// Step 1: Create a class of course with course id, course name,fee.
class Course {

    // Step 2: Fields (variables)
    int courseId;
    String courseName;
    double fee;

    // Step 3: Using Constructor Method
    public Course(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    // Step 4: Using Display method to display student details
    public void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Fee: " + fee);
    }
}

// Step 5: Create a public class of student is StudentManagement.
public class CourseManage {
    public static void main(String[] args) {

        //Step 6: Create a Object creation and assign the values
        Course c1 = new Course(11, "Java Fundamentals", 10000);

        // Step 7: Display the student details
        c1.display();

         /*
        Author - RAUNAK
        */
    }
}
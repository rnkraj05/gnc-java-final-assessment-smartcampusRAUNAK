// Step 1: Create a class of student with student id, student name, student email.
class Student {

    // Step 2: Fields (variables)
    int studentId;
    String name;
    String email;

    // Step 3: Using Constructor Method
    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    // Step 4: Using Display method to display student details
    public void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Step 5: Create a public class of student is StudentManagement.
public class StudentManagement {
    public static void main(String[] args) {

        //Step 6: Create a Object creation and assign the values
        Student s1 = new Student(1, "RAUNAK", "rnkraj@gmail.com");

        // Step 7: Display the student details
        s1.display();

        /*
        Author - RAUNAK
        */
    }
}
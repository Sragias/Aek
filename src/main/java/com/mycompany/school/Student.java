public class Student {
    private String firstName;
    private String lastName;
    private String studentNumber; // Αριθμός Μητρώου
    private Course[] courses = new Course[5]; // Πίνακας μαθημάτων

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void printStudent() {
        System.out.print("Student: " + firstName + " " + lastName + ", Student Number: " + studentNumber + ", Courses: ");
        for (Course course : courses) {
            if (course != null) {
                System.out.print(course.getCourseCode() + " ");
            }
        }
        System.out.println();
    }
}

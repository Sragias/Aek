public class Teacher {
    private String firstName;
    private String lastName;
    private String amka; 
    private Course course; 

    public Teacher(String firstName, String lastName, String amka, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.amka = amka;
        this.course = course;
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

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void printTeacher() {
        System.out.println("Teacher: " + firstName + " " + lastName + ", AMKA: " + amka + ", Course: " + course.getCourseCode());
    }
}

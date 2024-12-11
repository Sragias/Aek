public class Course {
    private String courseCode; 
    private String description; 
    private Classroom classroom; 
    public Course(String courseCode, String description, Classroom classroom) {
        this.courseCode = courseCode;
        this.description = description;
        this.classroom = classroom;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void printCourse() {
        System.out.println("Course: " + courseCode + ", Description: " + description + ", Classroom: " + classroom.getClassroomCode());
    }
}

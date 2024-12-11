public class Classroom {
    private String classroomCode; // Κωδικός Τάξης
    private String description; // Περιγραφή Τάξης

    public Classroom(String classroomCode, String description) {
        this.classroomCode = classroomCode;
        this.description = description;
    }

    public String getClassroomCode() {
        return classroomCode;
    }

    public void setClassroomCode(String classroomCode) {
        this.classroomCode = classroomCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printClassroom() {
        System.out.println("Classroom: " + classroomCode + ", Description: " + description);
    }
}

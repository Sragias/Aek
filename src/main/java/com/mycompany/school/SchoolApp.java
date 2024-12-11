public class SchoolApp {
    public static void main(String[] args) {
        // Δημιουργία Τάξεων
        Classroom classroom1 = new Classroom("E1", "Εργαστήριο 1");
        Classroom classroom2 = new Classroom("E2", "Εργαστήριο 2");
        Classroom classroom3 = new Classroom("M1", "Μαθηματικά Ι");
        Classroom classroom4 = new Classroom("P1", "Φυσική Ι");
        Classroom classroom5 = new Classroom("L1", "Λογική Ι");

        Course course1 = new Course("M1", "Μαθηματικά Ι", classroom1);
        Course course2 = new Course("P1", "Φυσική Ι", classroom2);
        Course course3 = new Course("C1", "Προγραμματισμός Ι", classroom3);
        Course course4 = new Course("L1", "Λογική Ι", classroom4);
        Course course5 = new Course("M2", "Μαθηματικά ΙΙ", classroom5);

        Teacher teacher1 = new Teacher("Γιώργος", "Παπαδόπουλος", "123456789", course1);
        Teacher teacher2 = new Teacher("Αλέξανδρος", "Βασιλείου", "987654321", course2);
        Teacher teacher3 = new Teacher("Μαρία", "Κωνσταντίνου", "112233445", course3);
        Teacher teacher4 = new Teacher("Ελένη", "Δημητρίου", "223344556", course4);
        Teacher teacher5 = new Teacher("Κώστας", "Νικολάου", "334455667", course5);

        Student student1 = new Student("Άννα", "Κωνσταντίνου", "1001");
        student1.setCourses(new Course[]{course1, course2, course3, course4, course5});
        Student student2 = new Student("Ελένη", "Πετρόπουλου", "1002");
        student2.setCourses(new Course[]{course2, course3, course4, course1, course5});

        teacher1.printTeacher();
        teacher2.printTeacher();
        teacher3.printTeacher();
        teacher4.printTeacher();
        teacher5.printTeacher();

        student1.printStudent();
        student2.printStudent();
    }
}

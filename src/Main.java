
public class Main {
    public static void main(String[] args) {

        double[] grades = new double[]{2.5, 3, 3.4, 2.1, 4.5, 3, 1};

        Student student1 = new Student("Michal", "Szpyruk", 31301, "s31301@pjwstk.edu.pl", "Warszawa", grades);
//        System.out.println(student1.getMean(student1.grades));
        student1.getMean(student1.grades);
        Student student2 = new Student("Marek", "Kowalski", 31302, "s31301@pjwstk.edu.pl", "Warszawa", grades);
        Student student3 = new Student("Michal", "Szpyruk", 31301, "s31301@pjwstk.edu.pl", "Warszawa", grades);

        StudentGroup infMngmGroup = new StudentGroup("Information Management");
        infMngmGroup.addStudent(student1);
        infMngmGroup.addStudent(student2);
        infMngmGroup.addStudent(student3);
    }
}
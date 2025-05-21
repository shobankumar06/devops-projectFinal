// File: StudentGrades.java
public class StudentGrades {

    private String[] students;
    private int[] grades;

    public StudentGrades(String[] students, int[] grades) {
        this.students = students;
        this.grades = grades;
    }

    public void printGrades() {
        System.out.println("Student Grades:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + grades[i]);
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {85, 92, 78, 90};

        StudentGrades sg = new StudentGrades(names, scores);
        sg.printGrades();

        System.out.println("Average grade: " + sg.calculateAverage());
    }
}

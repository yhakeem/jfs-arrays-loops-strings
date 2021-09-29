package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    private final ArrayList<String> students = new ArrayList<>();
    private final ArrayList<Integer> mathGrades = new ArrayList<>();
    private final ArrayList<Integer> scienceGrades = new ArrayList<>();
    private final ArrayList<Integer> englishGrades = new ArrayList<>();

    public MSGrades(){
        // Add some students and their grades to the array lists
        students.add("Joe Bob");
        students.add("Dorothy Jane");

        mathGrades.add(87);
        mathGrades.add(98);

        scienceGrades.add(76);
        scienceGrades.add(78);

        englishGrades.add(95);
        englishGrades.add(92);
    }

    public void printStudents(){
        for(String student:this.students){
            System.out.println(student);
        }
    }

    public void printStudentGrades(int studentIndex){
        System.out.println(this.students.get(studentIndex));
        System.out.println("Math: " + this.mathGrades.get(studentIndex));
        System.out.println("Science: " + this.scienceGrades.get(studentIndex));
        System.out.println("English: " + this.englishGrades.get(studentIndex));
    }

    // Bonus methods
    public void addStudent(String name, int math, int science, int english) {
        students.add(name);
        mathGrades.add(math);
        scienceGrades.add(science);
        englishGrades.add(english);
    }

    public void removeStudent(String name) {
        for (var i=0; i < this.students.size();i++){
            if (name.equals(this.students.get(i))){
                this.students.remove(i);
                this.mathGrades.remove(i);
                this.scienceGrades.remove(i);
                this.englishGrades.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        MSGrades LRMSGrade8 = new MSGrades();
        System.out.println();
        System.out.println("Middle School Roster");
        System.out.println("====================");

        // Bonus
        LRMSGrade8.removeStudent("Joe Bob");
        LRMSGrade8.addStudent("Jon Jackson", 90, 95, 98);

        LRMSGrade8.printStudents();
        System.out.println();

        for (int i=0; i < LRMSGrade8.teachers.length; i++){
            String teacher = "Teacher: ".concat(LRMSGrade8.teachers[i]);
            System.out.println(teacher);
        }

        System.out.println("\nStudent Grades:\n");
        for (int i =0; i < LRMSGrade8.students.size(); i++){
            LRMSGrade8.printStudentGrades(i);
            System.out.println();
        }
    }
}

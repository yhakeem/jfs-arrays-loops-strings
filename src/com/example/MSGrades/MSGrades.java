package com.example.MSGrades;
import java.util.ArrayList;
import java.util.Arrays;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};

    private final ArrayList<String> students = new ArrayList<String>();
    private final ArrayList<Integer> mathGrades = new ArrayList<Integer>();
    private final ArrayList<Integer> scienceGrades = new ArrayList<Integer>();
    private final ArrayList<Integer> englishGrades = new ArrayList<Integer>();


    public MSGrades() {
        // Add some students and their grades to the array lists
        students.add("Lala");
        students.add("Bebe");
        mathGrades.add(0, 89);
        mathGrades.add(1, 88);
        scienceGrades.add(0, 100);
        scienceGrades.add(1, 90);
        englishGrades.add(0, 75);
        englishGrades.add(1, 100);


    }

    public void printStudents() {
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void studentGrades(int number) {
        System.out.println(students.get(number) + " " + "Math:" + mathGrades.get(number));
        System.out.println(students.get(number) + " " + "Science:" + scienceGrades.get(number));
        System.out.println(students.get(number) + " " + "English:" + englishGrades.get(number));
    }

    public void teacherInfo() {
        for (int i = 0; i <teachers.length; i++){
            String variable = "Teacher: " + teachers[i];
            System.out.println(variable);
        }
    }

    public void complete() {
        for (int i = 0; i<students.size(); i++){
            studentGrades(i);
        }
    }


    public static void main(String[] args) {
        // write your code here
//        makes methods from above avaible in main & to sprint without this lien you cant have acess to it.
        MSGrades newName = new MSGrades();
////        testing methods
//        newName.studentGrades(1);
//        newName.printStudents();
//
//        System.out.println("Middle School Roster");
//        System.out.println("====================");




        System.out.println("\nStudent Grades:\n");
        newName.teacherInfo();
        newName.complete();
    }
}


package studentManagementSystem;


import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
//add student
    public void addStudent(Student S) {
        students.add(S);
        System.out.println("Student added successfully");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("no Student found");
            return;
        }

        for (Student S : students) {
            S.display();
            System.out.println("--------");
        }

    }

    public void searchStudent(int id) {
        for (Student S : students) {
            if (S.getId() == id) {
                S.display();
                return;
            }
        }
        System.out.println("student not found");
    }


    public void searchStudent(String name) {

        for (Student S : students) {

            if (S.getName().equalsIgnoreCase(name)) {
                S.display();
                return;
            }

        }

        System.out.println("Student Not Found.");
    }

    public void deleteStudentName(String name) {
        for (Student S : students) {
            if (S.getName().equalsIgnoreCase(name)) {
                students.remove(S);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }
        System.out.println("student not found");
    }

    public void deleteStudentId(int id) {
        for (Student S : students) {
            if (S.getId() == id) {
                students.remove(S);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }
        System.out.println("student not found");
    }


    public void updateStudent(String name, String course, double marks) {
        for (Student S : students) {
            if(S.getName().equalsIgnoreCase(name)){
                S.setCourse(course);
                S.setMarks(marks);
                System.out.println("Student profile updated successfully");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public void countStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        System.out.println("Total Students : " + students.size());
    }

    public void averageMarks(){
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        double Total = 0;
        for(Student S : students){
            Total = S.getMarks();
            double average = (Total / students.size());

            System.out.println("Average Marks :  + average");
        }
    }


        public void studentGrade(String name) {

            for (Student S : students) {

                if (S.getName().equalsIgnoreCase(name)) {

                    double marks = S.getMarks();

                    if (marks >= 90) {
                        System.out.println("Grade : A");
                    }
                    else if (marks >= 80) {
                        System.out.println("Grade : B");
                    }
                    else if (marks >= 70) {
                        System.out.println("Grade : C");
                    }
                    else if (marks >= 60) {
                        System.out.println("Grade : D");
                    }
                    else {
                        System.out.println("Grade : Fail");
                    }
                    return;
                }
            }

            System.out.println("Student Not Found.");
        }



    }








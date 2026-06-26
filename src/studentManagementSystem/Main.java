package studentManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. search student by id:");
            System.out.println("4. search student by name:");
            System.out.println("5. Delete Student by name:");
            System.out.println("6. Delete Student by id:");
            System.out.println("7. update student :");
            System.out.println("8. count students :");
            System.out.println("8. Average Marks :");
            System.out.println("8. count students :");
            System.out.println("8. count students :");
            System.out.println("8. count students :");
            System.out.println("12. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student S = new Student(id, name, course, marks);

                    service.addStudent(S);

                    break;
//view student
                case 2:

                    service.viewStudents();
                    break;
//search by id
                case 3:

                    System.out.println("enter student id:");
                    int searchId=sc.nextInt();

                    service.searchStudent(searchId);
                    break;
//search by name
                case 4:
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String searchName = sc.nextLine();

                    service.searchStudent(searchName);
                    break;
 //delete by name
                case 5:

                    sc.nextLine();

                    System.out.println("enter name" );
                    String deleteStudentByName = sc.nextLine();

                    service.deleteStudentName(deleteStudentByName);
                    break;
 //delete by id
                case 6  :
                    System.out.println("enter id");
                    int deleteStudentById =sc.nextInt();

                    service.deleteStudentId(deleteStudentById);
                    break;

                case 7:
//update
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String updatedname = sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String updatedcourse = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double updatedmarks = sc.nextDouble();

                    service.updateStudent(updatedname ,updatedcourse ,updatedmarks);
                    break;

                case 8:
                    service.countStudents();
                    break;

                case 9:
                    service.averageMarks();
                    break;

                case 10:

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String gradeName = sc.nextLine();

                    service.studentGrade(gradeName);
                    break;
//exit
                case 12:

                    System.out.println("Thank You!");
                    System.out.println("----------");
                    return;

                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}
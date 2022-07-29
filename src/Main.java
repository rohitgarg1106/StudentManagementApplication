import Student.Student;
import Student.StudentDAO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Insert student record");
            System.out.println("2: Delete student record");
            System.out.println("3: Update student record");
            System.out.println("4: Show all students records");
            System.out.println("5: Exit Program\n");

            int userInput = Integer.parseInt(sc.nextLine());

            if(userInput == 1){
                System.out.println(">>Enter name");
                String name = sc.nextLine();
                System.out.println(">>Enter phone");
                String phone = sc.nextLine();
                System.out.println(">>Enter city");
                String city = sc.nextLine();

                Student student = new Student(name, phone, city);
                if(StudentDAO.insertStudentToDB(student)){
                    System.out.println(">>Inserted record successfully");
                }else{
                    System.out.println(">>Record insertion failed");
                }
            }
            else if(userInput == 2){
                System.out.println(">>Enter student id");
                int studentId = Integer.parseInt(sc.nextLine());

                if(StudentDAO.deleteStudentFromDB(studentId)){
                    System.out.println(">>Deleted record successfully");
                }else{
                    System.out.println(">>Record deletion failed");
                }

            }
            else if(userInput == 3){
                System.out.println("Enter new student details:\n");

                System.out.println(">>Enter new student id");
                int studentId = Integer.parseInt(sc.nextLine());

                System.out.println(">>Enter new student name");
                String studentName = sc.nextLine();

                System.out.println(">>Enter new student phone");
                String studentPhone = sc.nextLine();

                System.out.println(">>Enter new student city");
                String studentCity = sc.nextLine();

                Student newStudent = new Student(studentName, studentPhone,studentCity);

                if(StudentDAO.updateStudentInDB(studentId, newStudent)){
                    System.out.println(">>Updated record successfully");
                }else{
                    System.out.println(">>Record updation failed");
                }

            } else if (userInput == 4) {

            }
            else if(userInput == 5){
                System.out.println("\nProgram exiting successfully...\n");
                break;
            }

        }

    }
}
